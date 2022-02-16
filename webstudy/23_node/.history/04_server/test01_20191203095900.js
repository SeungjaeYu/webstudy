/**
 * http 모듈을 이용한 서버 통신 방식
 */
const http = require("http");
const port = 10001;

// 서버 생성
const server = http.createServer(); // emit("request");

// 사용자의 요청 처리, emit("request");
server.on("request", () => {
    console.log("사용자 요청 들어옴...");
});

// 10001번 포트로 구동
server.listen(port);

console.log(`서버 ${port}번 구동중..`)