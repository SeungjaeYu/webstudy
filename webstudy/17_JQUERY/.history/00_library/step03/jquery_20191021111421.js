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
    elements.text = function (html) {
        if (html !== undefined) {
            for (let ele of this) {
                ele.innerText = html;
            }
            return this;
        } 
        let arr;
        
        return this[0].innerText;
    }
    return elements;
}


