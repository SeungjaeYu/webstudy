/**
 *  자바스크립트 문자열
 * 
 *  - "" 로 감싼다.
 *  - '' 로 감싼다.
 *  - ``(backtick) 로 감싼다. - template 문자열
 */

let msg = "자바스크립트 문자열";
console.log(msg);

msg = '자바스크립트 문자열';
console.log(msg);

msg = `자바스크립트 문자열`;
console.log(msg);

name = "홍길동";
msg = "나의 이름은 " + name + "입니다.";
console.log(msg);

msg = "나의 이름은 \"" + name + "\"입니다.";
console.log(msg);

msg = '나의 이름은 "' + name + '"입니다.`;
console.log(msg);