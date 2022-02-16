/**
 *  변수
 *  - 변수의 중복 선언이 가능함
 *  - 이전에 선언한 변수를 덮어쓴다.
 * 
 *  String name = "a";
 *  String name = "b";
 */
var id = "hong";
console.log(id);

// 중복 선언..
var id = "kim";
console.log(id);

// undefined : 변수에 아무 값도 없어서 타입을 알ㅈ ㅣ못하는 경우
var name;
console.log(name);
