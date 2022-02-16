// 데이터 응답하기
const http = require("http");
const port = 10001;
http.createServer((req, res) => {
    res.write(`
    <html>
    `);

    res.write("</html>");
    res.end();
}).listen(port, () => {
    console.log("서버 구동중");
});
