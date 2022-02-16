/**
 * 싱글 스레드 방식
 * 
 * 동시처리 방식 아님
 * 
 */
const http = require("http");
const port = 10001;
http.createServer((request, response) => {
    console.log("사용자 요청 들어옴...");
    setTimeout(() => {

    }, 5000);
}).listen(port, () => {
    console.log(`http://localhost:${port} 구동중..`);
});
