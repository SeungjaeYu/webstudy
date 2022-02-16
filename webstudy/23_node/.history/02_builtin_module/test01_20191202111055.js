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

console.time(); // ()을 주면 default로 
let sum = 0;
for (let i = 1; i < 1000000; i++) {
    sum += i;
}
console.log("합계 : %d", sum);
console.timeEnd();  // time()부터 timeEnd()까지의 시간을 계산해 console에 출력해 준다.
