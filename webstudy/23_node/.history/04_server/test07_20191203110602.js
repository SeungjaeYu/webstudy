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
    res.write(`
        url : " + urlObj.pathname<br />
        
    `);

}).listen(port, () => {
    console.log(`http://localhost:${port}/test.do?id=a&pass=b 호출됨`);
});