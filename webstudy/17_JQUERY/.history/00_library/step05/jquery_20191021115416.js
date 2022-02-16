let $ = mlec;

function mlec(val) {
    let elements = [];
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
            ele.addEventListener(eventType, listener)
        }
    };
    return elements;
}


