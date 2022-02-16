const http = require("http");
const port = 10001;
const server = http.createServer((request, response) => {
    response.send
    console.log("사용자 요청 들어옴...");
});

server.listen(port);