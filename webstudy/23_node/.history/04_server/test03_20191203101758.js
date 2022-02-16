// npm install supervisor -g => global(전역)
// 실행
// userpvisor 파일명
const http = require("http");
const port = 10001;
const server = http.createServer((request, response) => {
    console.log("사용자 요청 들어옴...");
    // 응답하기
    response.end();
});

server.listen(port, () => {
    console.log(`http://localhost:${port} 번 구동중...`);
});