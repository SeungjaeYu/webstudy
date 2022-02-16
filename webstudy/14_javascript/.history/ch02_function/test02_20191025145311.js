/**
 *  선언적 함수
 * 
 *  - 함수의 이름이 존재하는 것
 *  - 컴파일 시점에 함수의 정보가 등록(함수의 호이스팅)
 *  - 선언된 위치에 상관없이 사용이 가능
 *  - 함수가 별도의 return을 사용하지 않은 경우 기본적으로 반환되는 값 : undefined
 */

 function func1(num1, num2) {
     return num1 + num2;
 }
 let result = func1(10, 20);
 console.log("func1", result);

 result = func2();
 console.log(result);

 function func2() {
     return "선언전에 사용"
 }

//  function func1(num1, num2) {
//      return num1 * num2;
//  }       // 호이스팅이 일어나서 주석풀면 이 함수가 실행됨.
 function func3() {

 }
 result = func3();  //  undefined
 console.log("result : " + result);

