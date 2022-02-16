/**
 *  사용자 요청시 data/test.html 파일의 내용을 사용자에게 응답
 */

 const http = require("http");
 const port = 10001;
 const fs = require("fs");
http.createServer((req, res) => {
    if (req.url === "/favicon.ico") {
        res.end();
        return;
    }
    fs.readFile("data/test.html", "utf-8", (err, data) => {
        if (err) {
            res.end("<h1>서버 실행 중 에러 발생함</h1>");
            return;
        }
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
        res.end(data);
    })
}).listen(port,() => {
    console.log(`${port}`);
});