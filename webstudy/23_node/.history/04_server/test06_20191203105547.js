const http = require("http");
const port = 10001;
http.createServer((req, res) => {
    console.log("사용자 요청 들어옴", req.url);
    // 파비콘 처리하기
    if (req.url === "/favicon.ico") {
        
    } return;
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.write(`
        <html>
            <head><title>웹서버</title></head>
            <body>
                <h2>Node Server 테스트</h2>
            </body>
        </html>
    `);
    res.end();

}).listen(port, () => {
    console.log("서버 구동중");
});