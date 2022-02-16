// POST 방식일 경우의 파라미터 처리하기
const http = require("http");
const fs = require("fs");

const port = 10001;

http.createServer((req, res) => {
    console.log(req.method);
    if (req.url === "/favicon.ico") {
        res.end();
        return;
    }
    if (req.method === "GET") {
        fs.readFile("data/form.html", "utf-8", (err, data) => {
            if (err) {
                console.log("파일 읽기 중 에러 발생...");
                return;
            }
            console.log(data);
            res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
            res.end(data);
        });
    } else if (req.method === "POST") {
        console.log("POST 요청 들어옴");
        res.end();
    }

    res.end();
}).listen(port, () => {
    console.log(`http://localhost:${port} 구동중...`);
});