// querystring 모듈 : 쿼리에 대한 파싱 처리
// a=11&b=222
const qs = require("querystring");
let data = "id=test&pass=1234";
let param = qs.parse(data);
console.log(param)

