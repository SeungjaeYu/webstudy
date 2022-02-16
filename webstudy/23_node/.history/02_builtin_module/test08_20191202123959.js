// 특정 URL의 데이터 가져오기 : request
// 외부모듈
// npmjs.com 사이트 검색 후 사용
// npm install request
const request = require("request");
URL url = new URL("http://www.naver.com");
InputStream in = url.openStrea();
BufferedReader br = new BufferedReader(new InputStreaReader(in, "utf-8"));
while (true) {
    String line = br.readLine();
}
request("http://www.naver.com", function(err, response, body) {

});
