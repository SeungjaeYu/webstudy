/**
 *  ES6
 *  spread 연산자 이해하기
 * 
 *  객체의 내용을 복사해서 다른 객체를 만들때 편리하다.
 * 
 *  객체 활용
 */
let member = {
    id: "a",
    name: "b",
    age: 1
};
/*
member = {
    id: member.id,
    name: member.name,
    age: member.age,
    email: "c"
};
*/
/*

let member2 = {
    id: member.id,
    name: member.name,
    age: member.age,
    email: "c"
};

*/
// 새로운 프로퍼티 추가 복사
let member2 = {
    ...member,
    email: "c"
}
console.log(member2);

// 기존의 프로퍼티 변경하면서 복사
let member3 = {
    ...member,
    id: "ccc"
}
console.log(member3);

// 기존의 프로퍼티 변경하면서 실패
let member4 = {
    id: "ccc",
    ...member
}
console.log(member4);