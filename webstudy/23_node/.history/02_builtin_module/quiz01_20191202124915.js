// test.txt 파일의 내용을 읽어서 testcopy.txt에 저장(비동기 방식을 처리)
const fs = require("fs");

fs.readFile("test.txt", "utf-8", (err, data) => {
    if (err) {  // 에러가 존재 할 경우
        console.log("파읽 읽기 중 에러 발생");
        console.log(err);
        return;
    }
    console.log("파일 비동기 읽기 성공");
    fs.writeFile("testcopy.txt", data, "utf-8", (err) => {
        if (err) {
            console.log("파일 쓰기 중 에러 발생");
            console.log(err);
            return;
        }
        console.log("파일 비동기 쓰기 성공");
    });
});