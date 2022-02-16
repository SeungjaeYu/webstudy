const http = require("http");
const port = 10001;
const server = http.createServer((request, response) => {
    console.log("사용자 요청 들어옴...");
    // 응답하기
    response.end();
});

server.listen(port);