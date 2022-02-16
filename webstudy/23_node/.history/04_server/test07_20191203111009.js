/**
 *  사용자 요청에 대한 응답 처리
 * 
 *  http://localhost:10001/test.do?id=a&pass=b
 * 
 *  응답
 *  url : /test.do
 *  id : a
 *  pass : b
 */
const http = require("http");
const url = require("url");
const port = 10001;
http.createServer((req, res) => {
    if (req.url === "/favicon.ico")  {
        res.end();
        return;
    }
    let urlObj = url.parse(req.url, true);
    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"})
    res.write(`
        <div>
            <h2>url : ${urlObj.pathname}</h2>
            <h2>id : ${urlObj.query.id}</h2>
            <h2>pass : ${urlObj.query.pass}</h2>
        </div>
    `);
    res.end();
}).listen(port, () => {
    console.log(`http://localhost:${port}/test.do?id=a&pass=b 구동중`);
});