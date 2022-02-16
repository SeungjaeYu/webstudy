// POST 방식일 경우의 파라미터 처리하기
const http = require("http");
const fs = require("fs");

const port = 10001;

http.createServer((req, res) => {
    console.log(req.method);
    if (req.method === "GET") {
        fs.readFile("data/form.html", "utf-8", (err, data) => {
            if (err) {
                console.log("파일 읽기 중 에러 발생...");
                return;
            }
            res.end(data);
        });
    }

    res.end();
}).listen(port, () => {
    console.log(`http://localhost:${port} 구동중...`);
});