/**
 *  rest 함수 사용
 */

function fn1(...arg) {
    console.log(arg);   // arrow 함수에서는 arguments를 쓸 수 없다. -> rest 연산자를 이용하자
}
fn1(1, 2, 3, 4, 5);