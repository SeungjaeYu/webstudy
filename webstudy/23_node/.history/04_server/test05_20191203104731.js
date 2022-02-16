// 데이터 응답하기
const http = require("http");
const port = 10001;
http.createServer((req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.write(`
        <html>
            <head><title>웹서버</title></head>
            <body>
                <h2>Node Server 테스트</h2>
            </body>
        </html>
    `);

    res.write("</html>");
    res.end();
}).listen(port, () => {
    console.log("서버 구동중");
});
