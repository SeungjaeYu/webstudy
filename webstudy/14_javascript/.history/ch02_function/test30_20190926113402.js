let cnt = 0;
function doStart() {
    let d = new Date();
    let time = d.toLocaleTimeString();
    let id = setTimeout(function () {
        document.querySelector("#btnSelector").innerHTML = cnt + "회 클릭하셨습니다.";
    }, 3000);
}
function doClick() {
  cnt++;
}