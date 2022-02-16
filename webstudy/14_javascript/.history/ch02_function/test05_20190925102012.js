/**
 *  함수의 매개변수
 *  - 함수는 호출시 매개변수의 영향을 받지 않는다.
 *  - arguments : 함수의 내부에 선언된 프로퍼티를 이용해서 매개변수 정보를 가져올 수 있음
 */
function func1(...num) {
    console.log("func1 : ", num);
    console.log("arguments : ", arguments.length);
}
func1();
func1(10);
func1(10, 10);