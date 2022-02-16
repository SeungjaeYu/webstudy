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

let user2 = produce(user1, )