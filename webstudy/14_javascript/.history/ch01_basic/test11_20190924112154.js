/**
 *  변수의 범위
 * 
 *  - var로 선언된 변수는 글로벌 변수
 *  - 선언된 블록에 제한을 받지 않는다. 
 */
var msg = "1";
if (msg == "1") {
    var msg = "2";
    console.log(msg);
}
console.log(msg);   // 호이스팅이 일어나기 때문에 같은 변수로 메모리에 올라가서 2가 출력된다.
{
    var msg2 = "3";
}
console.log(msg2);
