/*
    사용자 요청 URL에 따라서 아래와 같이 처리하는 프로그램 작성
    - "/" 라면 board/index.html 파일의 내용을 읽어서 응답
    - "/writeForm.do" 라면 board/writeForm.html 파일의 내용을 읽어서 응답
    - "/write.do" 라면 전송된 파라미터의 내용을 읽어서 화면에 출력한다.
       목록 링크를 클릭 시 list.do 페이지를 호출하도록 한다.
       등록된 내용
       제목 : ㅁㅁㅁㅁ
       글쓴이 : ㅁㅁㅁㅁ
       내용 : ㅁㅁㅁㅁㅁ
       <a ... >목록</a>
    - "/list.do" 라면 board/list.html 파일의 내용을 출력한다.
    - 만약, 위의 url 외의 호출이 오면 error404.html 페이지의 내용 출력 
 */

const fs = require("fs");
const http = require("http");
const port = 10001;
let mappings = [];
let setMapping = (url, fileName) => mappings[url] = fileName;

setMapping("/", "board/index.html");
setMapping("/writeForm.do", "board/writeForm.html");
setMapping("/write.do", "board/list.html");

http.createServer((req, res) => {

}).listen(port, () => {
   console.log("서버 구동중");
});


let error404 = (response) => {
   response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
   response.end("존재하지 않는 경로입니다.");
};

function send(response, fileName) {

}





