/**
 *  ES6 - 화살표 함수(자바의 람다 유사)
 * 
 *  - 함수를 심플하게 정의 할 수 있다.
 *  형태
 *  function (매개변수) => { 실행내용; }
 *  (매개변수) => { 실행내용; }
 */
let func1 = function() {
    console.log("익명함수 1");
};
func1();

func1 = () => {
    console.log("화살표함수 1")
};
