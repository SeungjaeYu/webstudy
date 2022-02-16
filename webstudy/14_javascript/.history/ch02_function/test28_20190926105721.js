function doAction() {
    console.log("클릭");
    // document.querySelector("#result").innerHTML = "클릭";
    let pEle = document.querySelectorAll(".food");
    let ele = document.querySelector("#result");
    for (let i = 0; i < pEle.length; i++ ) {
        ele.i = pEle[i].innerHTML
    }
    ele.innerHTML = pEle.innerHTML;
}
function doClear() {
    console.log("지우기");
    // document.querySelector("#result").innerHTML = "지우기";
}