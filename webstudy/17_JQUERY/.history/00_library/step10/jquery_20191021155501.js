let $ = mlec;

function mlec(val) {
    let elements = [];
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
            break;
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
        return this;
    };

    
    return elements;
}


