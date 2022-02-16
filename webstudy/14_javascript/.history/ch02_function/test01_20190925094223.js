/**
 *  함수, 메서드(객체에 포함되어 있을때)
 * 
 *  function 함수이름(매개변수) {
 *      실행코드
 * }
 * 
 * 함수이름(값...)
 */
// 파라미터와 반환타입 없는 경우
function func1() {
    console.log("func1");
}

func1();

// 파라미터가 없고 반환값이 있는 경우
function func2() {
    console.log("func2");
    return "반환-2";
}
func2();
let result = func2();
console.log(result);
