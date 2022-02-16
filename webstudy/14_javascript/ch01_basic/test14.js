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

msg = '나의 이름은 "' + name + '"입니다.';
console.log(msg);

msg = `나의 이름은 "${name}"입니다.`;   // 백틱을 사용하게 되면 변수 + 할 필요없이 template 문자열(${})로 변수를 사용할 수 있다.
console.log(msg);   // 주의. 따로 js파일로 관리하면 상관이 없지만 jsp안에서 사용하면 톰캣에서 el로 인식하게 된다. .js로 빼서 사용하자..

msg = `<input type='text' onclick='alert("클릭됨")' />`;
console.log(msg);

msg = "<input type='text' onclick='alert(\"클릭됨\")' />";
console.log(msg);

