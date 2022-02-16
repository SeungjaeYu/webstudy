/** 
    사용자가 호출하는 url에 따라서 아래와 같이 특정 파일을 읽어서 전송하는 프로그램 작성

    /html.do  로 호출할 경우에는 data/test.html 의 내용을 전송
    Content-Type : .. 기존과 동일하게 설정
    
    /image.do  로 호출할 경우에는 data/test.jpg 의 내용을 전송
    Content-Type : image/jpeg

    /audio.do  로 호출할 경우에는 data/test.mp3 의 내용을 전송
    Content-Type : audio/mp3

    위의 경로에 해당하지 않은 경우
    "존재하지 않는 경로입니다." 메세지 전송
*/
const http = require("http");
const fs = require("fs");
const port = 10001;

let mappings = [];

let setMapping = (url, name, type) => mappings[url] = {name, type};

setMapping("/html.do", "test.html", "text/html; charset=utf-8");
setMapping("/image.do", "test.jpg", "image/jpeg");
setMapping("/audio.do", "test.mp3", "audio/mp3");

http.createServer((request, response) => {
    if (request.url === "/favicon.ico") {
        response.end();
        return;
    }
    send(response, mappings[request.url]);
})
.listen(port, () => console.log(`http://localhost:10001 구동중..`));

function error404(response) {
    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.end("존재하지 않는 경로입니다.");
}

function send(response, info) {
    if (info === undefined) {
        error404(response);
        return;
    }
    fs.readFile("data/" + info.name, (err, data) => {
        if (err) {
            response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
            response.end("<h1>처리중 에러 발생</h1>");
            return;
        }
        response.writeHead(200, {"Content-Type": info.type});
        response.end(data);
    });
}