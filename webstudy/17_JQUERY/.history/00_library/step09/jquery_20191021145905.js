let $ = mlec;

function mlec(val) {
    let elements = [];
    // val 이 "<" 로 시작하는 경우는 태그 생성
    switch(val.charAt(0)) {
        ca
    } 

    for (let ele of document.querySelectorAll(val)) {
        elements.push(ele);
    }
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
    return elements;
}


