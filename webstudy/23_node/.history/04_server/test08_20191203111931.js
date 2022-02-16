/**
 *  사용자 요청시 data/test.html 파일의 내용을 사용자에게 응답
 */

 const fs = require("fs");



 function 
 fs.readFile("data/test.html", "utf-8", (err, data) => {
    if (err) {  // 에러가 존재 할 경우
        console.log("파읽 읽기 중 에러 발생");
        console.log(err);
        return;
    }
    // 정상적으로 파일을 읽은 경우
    console.log("비동기 읽은 데이터");
    console.log(data);
});