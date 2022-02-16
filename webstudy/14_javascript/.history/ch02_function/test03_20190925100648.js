/**
 *  익명함수
 * 
 *  - 함수의 이름이 없다.
 *  - 이름이 없는데 호출을 어떻게?? : 변수에 담아서 사용함
 *  - 함수를 변수에 담아서 사용 : 일급객체(기능을 가지고 있는 객체. 대표적으로 함수)
 *  - 함수도 하나의 값이다.
 *  - 함수의 호이스팅 대상에서 제외됨 (var func1이라면 func1인 변수가 호이스팅된다.)
 *  - 선언된 이후에만 사용이 가능함
 * 
 *  변수 = function (매개변수) {
 *      실행할일
 *      return
 *  }
 */ 
let func1 = function () {
    console.log("이름 없는 함수 - 익명함수");
};
console.log(func1);     //  [Function: func1]   -> 자바의 Member m = new Member(); System.out.println(m)
func1();

// let result = func2(10); 선언되기 전에 사용이 불가능. -> Cannot access 'func2' before initialization

result = func2(10); //var func2;만 호이스팅이 된다.

let func2 = function (val) {
    console.log("func2 : " + val);
    return val * val;
}

let result = func2(10);
console.log(result);
