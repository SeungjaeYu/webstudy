/**
 *  객체 이해하기
 *  - 객체를 만드는 법
 *  - 생성된 객체에 값을 설정
 *  - 객체의 값을 꺼내는 방법
 */
// 빈 객체 생성
let member = {};

// 객체 프로퍼티 설정
member.id = "hong";
member["email"] = "hong@a.com";

// 객체 프로퍼티 확인
console.log(member.id);
console.log(member["email"]);

member["home-page"] = "a.com";
//  member.home - page
// console.log(member.home-page);  //  ReferenceError: page is not defined => member.home에서 page를 뺀다.
console.log(member["home-page"]);


