let cnt = 0;
function doStart() {
    let d = new Date();
    let time = d.toLocaleTimeString();
    let id = setTimeout(doStart, 3000);
    // clearTimeout(id);
    document.querySelector("#btnSelector").innerHTML = cnt + "회 클릭하셨습니다.";
}
function doClick() {
  cnt++;
}