// 사용자 요청 처리 하기
const http = require("http");
const port = 10001;
const server = http.createServer(() => {
    console.log("사용자 요청 들어옴...");
});
server.listen(port);
console.log(`http://localhost:${port}번 구동중`);

