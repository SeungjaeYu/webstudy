/**
 *  간단한 조건 표현식 : 논리 연산자 이용
 */
let num = 9;

if (num % 2 == 0) {
    console.log("짝수이다.");
}

(num % 2 == 0) && console.log("짝수이다.");

(num % 2 != 0) && console.log("홀수이다.");

console.log(num);

let msg;
msg = msg || '값이 없음';
console.log(msg);