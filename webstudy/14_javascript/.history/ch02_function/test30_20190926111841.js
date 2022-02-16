let cnt = 0;
function doStart() {
    
    // clearTimeout(id);
    document.querySelector("#btnSelector").innerHTML = cnt + "회 클릭하셨습니다.";
}
function doClick() {

  cnt++;
 
}

