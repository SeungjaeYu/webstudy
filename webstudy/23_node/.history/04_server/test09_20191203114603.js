/**
 *  사용자가 호출하는 url에 따라서 아래와 같이 특정 파일을 읽어서 전송하는 프로그램 작성
 * 
 *  /html.do 로 호출할 경우에는 data/test.html 의 내용을 전송
 *  Content-Type : .. 기존과 동일하게 설정
 * 
 *  /image.do 로 호출할 경우에는 data/test.jpg 의 내용을 전송
 *  Content-Type : image/jpeg
 * 
 *  /audio.do 로 호출할 경우에는 data/test.mp3 의 내용을 전송
 *  Content-Type : audio/mp3
 * 
 *  위의 경로에 해당하지 않는 경우
 *  "존재하지 않는 경로입니다." 메세지 전송
 */

 const fs = require("fs");
 const url = require("url");
 const http = require("http");
 http.createServer((req,res) => {
    if (req.url == "/favicon.ico") {
        res.end();
        return;
    }
    let urlValue = url.parse(req.url, true);
    urlValue = urlValue.pathname;
    if (urlValue === "/html.do") {
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    } else if (urlValue === "/image.do") {
        res.writeHead(200, {"Content-Type" : "image/jpeg"});
    } else if (urlValue === "/audio.do") {
        res.writeHead(200, {"Content-Type" : "audio/mp3"});
    } else {
        res.end("")
    }

 })