function doAction() {
    console.log("클릭");
    // document.querySelector("#result").innerHTML = "클릭";
    let pEle = document.querySelector(".food");
    for (let i = 0; i < pEle.clientHeight; )
    let ele = document.querySelector("#result");
    ele.innerHTML = pEle.innerHTML;
}
function doClear() {
    console.log("지우기");
    // document.querySelector("#result").innerHTML = "지우기";
}