// 불변성을 처리하는 방식 - 2
// 객체 res-spread
let user1 = {
    id: "hong", name: "홍", addr: {postNo: "12345", basic: "서울시"} 
};
let user2 = {name: "김", ...user1 };
console.log(user1);
console.log(user2);