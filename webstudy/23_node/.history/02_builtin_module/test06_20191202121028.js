// 파일 입출력 모듈 : fs
// Sync 붙은 함수 : 동기적 함수, Sync 붙지 않은 함수 : 비동기적 함수
const fs = require("fs");


// 비동기적 읽기
// {encoding : "utf-8"}
fs.readFile("test.txt", "utf-8", (err, data) => {
    if (err) {  // 에러가 존재 할 경우
        console.log("파읽 읽기 중 에러 발생");
        console.log(err);
        return;
    }
    // 정상적으로 파일을 읽은 경우
    console.log("비동기 읽은 데이터");
    console.log(data);
});
console.log("비동기 파일 읽기 호출 후 ...");
// 동기적 읽기
try {
    let result = fs.readFileSync("test.txt", "utf-8");
    console.log("동기 파일 읽기 호출 후 ...");
    console.log("읽은 데이터 : " + result);
} catch (e) {
    
}
