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
        
    })
    res.write(fs.readFile("data/test.html", "utf-8"));
    res.end();
}).listen(port,() => {
    console.log("서버 열림");
});