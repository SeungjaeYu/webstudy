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
    req.url;
}).listen(port, () => {

});