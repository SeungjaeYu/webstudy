const http = require("http");
const fs = require("fs");
const ejs = require("ejs");

http.createServer((req, res) => {
    ejs.renderFile(
        "./view/test02.ejs",
        {
            title: "EJS 동적 데이터 전달"
        },
        (err, data) => {   // ejs가 렌더링 한 값이 넘어온다.
            if (err) {
                throw err;
            }
            res.writeHead(200, {"Content-Type" : "text/html; charset = utf-8"});
            res.end(data);
    });
})
.listen(10001);