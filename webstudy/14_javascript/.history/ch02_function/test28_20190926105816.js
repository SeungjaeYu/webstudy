function doAction() {
    console.log("클릭");
    // document.querySelector("#result").innerHTML = "클릭";
    let pEle = document.querySelectorAll(".food");
    let msg = "전체 : " + pEle.length + "개 <br />"
    for (let i = 0; i < pEle.length; i++ ) {
        ele.innerHTML = pEle[i].innerHTML;
    }
    let ele = document.querySelector("#result");
    // ele.innerHTML = pEle.innerHTML;
}
function doClear() {
    console.log("지우기");
    // document.querySelector("#result").innerHTML = "지우기";
}