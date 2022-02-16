/**
 *  변경불가 : 생성된 이후에 객체의 상태를 변경할 수 없게 사용하는 것
 *  함수형 프로그램의 핵심 원리
 * 
 *  불변성을 처리하는 방식1
 * 
 *  
 */
/*
let user1 = { id: "hong" };
let user2 = Object.assign({}, user1);
console.log(user1, user2);

let user3 = {};
let user4 = Object.assign(user3, user1);
console.log(user1, user3, user4);
console.log(user1 == user3);
console.log(user1 == user4);
console.log(user3 == user4);
*/
let user5 = Object.assign()