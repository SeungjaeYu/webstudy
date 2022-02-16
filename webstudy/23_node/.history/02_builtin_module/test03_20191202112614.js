// url 모듈 : url 정보를 분석
const url = require("url");
let urlObj = url.parse("http://localhost:8000/login.do?id=abc&pass=1234");
console.log(urlObj.pathname);   // login.do
console.log(urlObj.query);

