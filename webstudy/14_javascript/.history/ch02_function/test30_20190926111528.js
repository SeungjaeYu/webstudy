let cnt = 0;
function doStart() {
    let d = new Date();
    let time = d.toLocaleTimeString();
    let id = setTimeout(doStart, 3000);
    clearTimeout(id);
    setTimeout
}
function doClick() {
  cnt++;
}