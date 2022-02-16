// 불변성을 처리하는 방식 - 2
// 객체 res-spread
let user1 = {
    id: "hong", name: "홍", addr: {postNo: "12345", basic: "서울시"} 
};
let user2 = {...user1 /*, name:"김"*/ };    // 변경 하려는 걸 뒤쪽에 명시해야 한다.
console.log(user1);
console.log(user2);
console.log(user1 == user2);
console.log(user1.addr = user2.addr);
