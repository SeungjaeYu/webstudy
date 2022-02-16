/**
 *  자바스크립트 생성자 이해
 * 
 *  - 일반 함수와 동일하게 선언 사용 가능함
 *  - 이름을 일반적으로 대문자로 시작하게 선언한다.(Number, Array, Date, ..)
 *  - 생성자 역활로 사용하려면 반드시 "new"와 함꼐 사용해야 한다.
 *  - 생성자 함수로 생성되면 함수내에서의 this의 해석이 달라진다.
 */
function Member() {
    console.log(this);
}
let m1 = Member();
console.log(m1);


