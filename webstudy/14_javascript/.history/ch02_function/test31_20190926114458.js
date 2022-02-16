/**
 *  let id = setInterval(콜백함수, 밀리세컨드);
 *  clearInterval(id);
 * 
 */
function func() {
    console.log("func 호출됨..");
}
// setTimeout(func, 1000);
let id = setInterval(func, 1000);
set