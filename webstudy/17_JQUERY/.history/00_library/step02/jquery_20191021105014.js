let $ = mlec;

function mlec(val) {
    let elements = [];
    for (let ele of document.querySelectorAll(val)) {
        elements.push(ele);
    }
    elements.html = function (html) {
        console.log(html);
        if (typeof(html) == 'undefined')

        for (let ele of this) {
            ele.innerHTML = html;
        }
    };
    return elements;
}


