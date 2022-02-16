/**
 *  익명함수
 * 
 *  - 함수의 이름이 없다.
 *  - 이름이 없는데 호출을 어떻게?? : 변수에 담아서 사용함
 *  - 함수를 변수에 담아서 사용 : 일급객체(기능을 가지고 있는 객체. 대표적으로 함수)
 *  - 함수도 하나의 값이다.
 *  - 호이스팅이 되지 않는다
 *  변수 = function (매개변수) {
 *      실행할일
 *      return
 *  }
 */ 
let func1 = function () {
    console.log("이름 없는 함수 - 익명함수");
}
