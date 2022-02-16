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
let member2 = {
    ...member,
    email: "c"
}
console.log(member2);

let member3 = {
    ...member,
    email: "c"
}
console.log(member2);