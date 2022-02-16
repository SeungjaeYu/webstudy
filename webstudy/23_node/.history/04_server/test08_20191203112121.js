/**
 *  사용자 요청시 data/test.html 파일의 내용을 사용자에게 응답
 */

 const http = require("http");
 const port = 10001;
 const fs = require("fs");
http.createServer((req, res) => {
    if (req.url === "/favicon.")
    let data = readData();
    res.write(data);
    res.end();
}).listen(port,() => {

});



 function readData() {
     fs.readFile("data/test.html", "utf-8", (err, data) => {
        if (err) { 
            console.log(err);
            return;
        }
        return data;
    });
 }