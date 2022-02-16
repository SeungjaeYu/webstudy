/**
 *  객체 이해하기
 * 
 *  객체 생성시 값의 초기화 및 프로퍼티 삭제하기
 */
let member = {
    id: "hong",
    email: "hong@a.com"
};
console.log(member);

member.name = "홍길동";
console.log(member);

// 프로퍼티 삭제
delete member.name;
console.log(member);