/**
 *  함수의 호이스팅과 오버로딩
 * 
 *  - 함수의 오버로딩을 지원하지 않는다.
 *  - 매개변수의 개수와 상관없이 함수의 이름으로 호출이 가능
 */
var func = function () {
    console.log(1);
}
func(1);

function func(num) {
    console.log(2);
}
func(10);


