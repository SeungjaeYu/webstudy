// POST 방식일 경우의 파라미터 처리하기
const http = require("http");
const fs = require("fs");

const port = 10001;

http.createServer((req, res) => {
    if (req.url === "/favicon.ico") {
        res.end();
        return;
    }
    console.log(req.method);
    if (req.method === "GET") {
        fs.readFile("data/form.html", "utf-8", (err, data) => {
            if (err) {
                console.log("파일 읽기 중 에러 발생...");
                return;
            }
            res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
            res.end(data);
        });
    } else if (req.method === "POST") {
        console.log("POST 요청 들어옴");
        // 파라미터 추출 이벤트
        // 파라미터 추출 중간 호출 : data
        // 파라미터 추출 종료시 호출 : end
        req.on("data", () => {
            
        });
        req.on("end", () => {

        });
        res.end();
    }

}).listen(port, () => {
    console.log(`http://localhost:${port} 구동중...`);
});