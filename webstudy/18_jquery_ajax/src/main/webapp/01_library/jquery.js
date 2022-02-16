// http://javascriptcompressor.com/
// https://beautifier.io/
let $ = mlec;

function mlec(val) {
    if (typeof(val) == "function") {
        window.onload = val;
        return;
    }
    let elements = [];
    if (val instanceof HTMLElement) {
        elements[0] = val;
    }
    else {
        // val 이 "<" 로 시작하는 경우는 태그 생성
        switch(val.charAt(0)) {
            case "<" :
                // <h2>
                elements[0] = document.createElement(val.substring(1, val.length - 1));
                break;
            default :
                for (let ele of document.querySelectorAll(val)) {
                    elements.push(ele);
                }
        } 
    }
    elements.append = function(childs) {
        for (let el of this) {
            for (let child of childs) {
                // 깊은 복사 -> .cloneNode(true) 를 주지 않으면 복사가 아닌 이동의 개념이 된다. 
                el.append(child.cloneNode(true));
            }
        }
        return this;
    };


    elements.html = function (html) {
                
        if (html !== undefined) {
            for (let ele of this) {
                ele.innerHTML = html;
            }
            return this;
        } 
        return this[0].innerHTML;
    };
    
    elements.text = function (text) {
        if (text !== undefined) {
            for (let ele of this) {
                ele.innerText = text;
            }
            return this;
        } 
        // text 매개변수에 값이 없는 경우는 innerText 값을 넘겨준다.
        let result = "";
        for (let ele of this) {
            result += ele.innerText + "\r\n";
        }
        return result;
    };
    elements.val = function (value) {
        if (value !== undefined) {
            for (let ele of this) {
                ele.value = value;
            }
            return this;
        }
        return this[0].value;
    };
    
    elements.on = function (eventType, listener) {
        for (let ele of this) {
            ele.addEventListener(eventType, listener);
        }
        return this;
    };
    
    elements.click = function(listener) {
        return this.on("click", listener);
    }

    elements.mousemove = function(listener) {
        return this.on("mousemove", listener);
    }
    /*
    elements.attr = function(name, value) {
        for (let ele of this) {
            ele.setAttribute(name, value);
        }
        return this;
    }
    */
    elements.attr = function(name, value) {
        if (typeof(name) === "object") {
            for (let ele of this) {
                for (let key in name) {
                    ele.setAttribute(key, name[key]);
                }
            }
            return this;
        }
        if (value !== undefined) {
            for (let ele of this) {
                ele.setAttribute(name, value);
            }
            return this;
        }
        return this[0].getAttribute(name);
    }

    elements.css = function(name, value) {
        if (typeof(name) === "object") {
            for (let ele of this) {
                for (let key in name) {
                    ele.style[key] = name[key];
                }
            }
            return this;
        }
        if (value !== undefined) {
            for (let ele of this) {
                ele.style[name] = value;
            }
            return this;
        }
        return this[0].style[name];
    };

    elements.remove = function () {
        for (let el of this) {
            el.remove();
        }
    };

    elements.prop = function(name, value) {
        if (value !== undefined) {
            for (let el of this) {
                el[name] = value;
            }
            return this;
        }
        return this[0][name];
    }
    
    elements.addClass = function (name) {
        for (let el of this) {
            el.classList.add(name);
        }
        return this;
    };
    elements.removeClass = function (name) {
        for (let el of this) {
            el.classList.remove(name);
        }
        return this;
    };
    elements.toggleClass = function (name) {
        for (let el of this) {
            el.classList.toggle(name);
        }
        return this;
    };

    return elements;
}

// Ajax 파트 추가
$.ajax = function (options) {
//	console.dir(options);
//	console.dir(options.type);
//	console.dir(options.url);
//	console.dir(options.data);
//	console.dir(options.success);
	
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function () {
		if (xhr.readyState === 4) {
			if (xhr.status === 200) {
				let result = xhr.responseText;
				if (options.dataType === "json") result = JSON.parse(result);
				
				options.success(result);
			}
		}
	};
	
	let method = options.type ? options.type : "GET";
	if (method !== "GET" && method !== "POST") method = "GET"; // 사용자가 오타를 입력했을 경우 GET으로 변경
	
	let params = "";
	if (options.data) {
		if (typeof(options.data) === "string") {
			params = options.data;
		} else {
			for (let key in options.data) {
				if (params !== "") params += "&";
				params += key + "=" + options.data[key];
			}
		}
	}
	
	let url = options.url;
	
	if (method === "GET" && params !== "") {
		url += "?" + params;
	}
	xhr.open(method, url, true);
	if (method === "POST") {
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	}
	
	xhr.send(method === "POST" ? params : null);

	
	
	
	
	
};

