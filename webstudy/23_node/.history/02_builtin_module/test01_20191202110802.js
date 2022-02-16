// 전역객체, console : 콘솔창과 관련된 기능을 다루는 객체
// 전역변수 : 현재 작업 디렉토리 가져오기(__dirname)
console.log("__dirname : " + __dirname);
console.log("__filename : " + __filename);

let msg="Hello NodeJS";
let member = {
    id: "hong",
    name: "길동",
    age: 33
};
// nodeJS에서 제공해주는 console 객체(javascript가 아님)
console.log("%s!!!", msg);
console.log("%j", member);  // %j => json 객체를 표현
console.log("%d", member.age);  