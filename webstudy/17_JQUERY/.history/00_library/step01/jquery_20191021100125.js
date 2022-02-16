// 자바스크립트 변수에 외자로 특수문자 사용할 수 있는 것 - $, _

let $ = mlec;

function mlec(val) {
    let elements = [];
    for (let ele of document.querySelectorAll(val)) {
        elements.push(ele);
    }
    return elements;
}
