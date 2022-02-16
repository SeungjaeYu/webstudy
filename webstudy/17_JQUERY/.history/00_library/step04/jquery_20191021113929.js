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
    }
    elements.val = function (val) {
        if (val !== undefined) {
            for (let ele of this) {
                ele.value = val;
            }
            return this;
        } 
        // text 매개변수에 값이 없는 경우는 innerText 값을 넘겨준다.
        let result = "";
        for (let value of this) {
            result += ele.innerText + "\r\n";
        }
        return result;
        
    }
    return elements;
}


