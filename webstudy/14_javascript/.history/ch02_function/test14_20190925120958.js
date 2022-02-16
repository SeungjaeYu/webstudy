/**
 *  콜백함수 사용하기
 *  - 함수를 결과로 리턴하기
 */
function func() {
    
    function cb() {
        console.log("리턴된 함수 실행");
    }
    return cb;
}

let myCb = func();
// console.log("myCb : ", myCb);
myCb();
myCb();
myCb();