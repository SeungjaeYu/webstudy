// 파일 입출력 모듈 : fs
// Sync 붙은 함수 : 동기적 함수, Sync 붙지 않은 함수 : 비동기적 함수
const fs = require("fs");


// 비동기적 읽기
fs.readFile("test.txt", {enc"utf-8"});
console.log("비동기 파일 읽기 호출 후 ...");
// 동기적 읽기
fs.readFileSync();
console.log("동기 파일 읽기 호출 후 ...");
