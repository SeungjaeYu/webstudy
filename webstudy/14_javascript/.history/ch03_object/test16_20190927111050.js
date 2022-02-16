/**
 *  ES6
 * 
 *  rest 연산자
 *  객체 또는 배열의 값을 손쉽게 받는다.
 */
let member = {
    id: "a",
    name: "b",
    age: 1
};
let {id, ...user} = member;
console.log(id, user);

let arr1 = [1, 2, 3, 4, 5];
let [] = arr1;