//  불변성을 처리 하는 방식 - 라이브러리 활용
//  immer.js
//  npm install immer
//
import produce from 'immer';

let user1 = {
    id: "hong",
    name: "홍",
    addr: { postNo: "12345", basic: "서울시" }
};

let user2 = produce(user1, user => {    //user1의 내용이 user에 다 들어가 있다.
    user.addr.postNo = "67890";
});

console.log(user1 === user2);
console.log(user1);
console.log(user2);

let arr1 = [1, 2, 3];
let arr2 = produce(arr, arr )
