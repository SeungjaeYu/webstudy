// url 모듈 : url 정보를 분석
const url = require("url");
let urlObj = url.parse(
                "http://localhost:8000/login.do?id=abc&pass=1234", true
            );
console.log(urlObj.pathname);   // /login.do
console.log(urlObj.query);      // id=abc&pass=1234
console.log(urlObj.query.id);      // id=abc&pass=1234 // true라는 옵션을 줬을 때
console.log(urlObj.query.pass);      // id=abc&pass=1234  


