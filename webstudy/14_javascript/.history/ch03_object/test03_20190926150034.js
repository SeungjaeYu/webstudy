/**
 *  객체의 정보 확인하기
 */
let member = {
    id : "hong",
    email : "hong@a.com"
};

let member2 = member;
member2.name = "김.";

console.log(member);
console.log(member2);

// 객체의 내용 확인하기
for (let k in member) {
    console.log("key :", k, "value :", member[k]);
}

