/**
 *  변수의 범위
 * 
 *  - var로 선언된 변수는 글로벌 변수
 *  - 선언된 블록에 제한을 받디 않는다. 
 */
var msg = "1";
if (msg == "1") {
    var msg = "2";
    console.log(msg);
}
console.log(msg);
