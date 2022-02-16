/**
 *  콜백함수 사용하기
 *  - 함수를 결과로 리턴하기
 */
function func() {
    return cb();     //  함수를 실행하고 실행된 결과인 undefined가 반환
    // return cb;  // 함수에 대한 참조 주소만 넘겨줌
}
function cb() {
    console.log("리턴된 함수 실행");
}
let myCb = func();
console.log("myCb : ", myCb);
// myCb();
// myCb();
// myCb();