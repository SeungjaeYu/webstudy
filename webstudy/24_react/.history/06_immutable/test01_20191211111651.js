/**
 *  변경불가 : 생성된 이후에 객체의 상태를 변경할 수 없게 사용하는 것
 *  함수형 프로그램의 핵심 원리
 * 
 *  불변성을 처리하는 방식1
 * 
 *  
 */
let user1 = { id: "hong" };
let user2 = Object.assign({}, user1);

