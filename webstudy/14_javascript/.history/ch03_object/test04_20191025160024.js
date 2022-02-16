/**
 *  this는 자바스크립트에서 다양하게 해석된다.
 * 
 *  객체에서의 함수의 this는 함수를 호출한 객체가 된다.
 */
// "use strict";
let m1 = {name: "홍길동"};
let m2 = {name: "윤하"};

function msg() {
    console.log(this.name);
}
msg();
m1.msg = msg;
m2.msg = msg;
m1.msg();
m2.msg();
