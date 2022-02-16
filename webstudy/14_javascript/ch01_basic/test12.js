/**
 *  ecma6 추가
 * 
 *  let : 호이스팅에서 제외
 */
var msg = 1;
if (msg == 1) {
    let msg = 2;
    console.log(msg);
}
console.log(msg);
{
    let msg2 = 3;
}
console.log(msg2);

