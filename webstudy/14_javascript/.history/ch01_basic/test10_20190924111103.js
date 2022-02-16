/**
 *  데이터 타입 검사
 * 
 *  typeof 데이터 -> 데이터타입을 문자열로 반환
 *  typeof (데이터)
 *  "number", "string", ...
 *  null 데이터 타입은 "null"이 아니라 "object" 반환
 */
console.log(typeof("test"));    // "string"
console.log(typeof(10));    // "number"
console.log(typeof(true));    // "boolean"
console.log(typeof(null));    // "object"
var a;
console.log(typeof(a));    // "undefined"
console.log(typeof({}}));    // "undefined"
