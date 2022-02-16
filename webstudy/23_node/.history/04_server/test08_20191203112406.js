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
    let data = readData();
    console.log(data);
    //res.write(data);
    //res.end();
}).listen(port,() => {
    console.log("서버 열림");
});



 function readData() {
     return fs.readFileSync("data/test.html", "utf-8");
 }