/**
 *  함수의 매개변수
 *  - 함수는 호출시 매개변수의 영향을 받지 않는다.
 *  - arguments : 함수의 내부에 선언된 프로퍼티를 이용해서 매개변수 정보를 가져올 수 있음
 */
function func1(num) {
    {
        0: 'a',
        1: 'b',
        le
    }
    console.log("func1 : ", num);
    // 유사배열객체(객체의 내부에 length 프로퍼티를 가지고 있는 객체) : arguments;
    console.log("arguments : ", arguments.length);
}
func1();
func1(10);
func1(10, 10);