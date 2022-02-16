let cnt = 0;
function doStart() {
    let d = new Date();
    let time = d.toLocaleTimeString();
    let id = setTimeout(dd, 3000);
}
function doClick() {
  cnt++;
}

function dd() {
    document.querySelector("#btnSelector").innerHTML = cnt + "회 클릭하셨습니다.";
}