/*
    prompt-sync, request, fs 모듈을 활용합니다.
    주소 입력 : http://www.naver.com
    저장파일명 : naver.txt
    naver.txt 파일이 생성되고 입력된 주소에서 html내용을
    naver.txt 파일에 저장합니다.
*/

const prompt = require("prompt-sync");
const request = require("request");
const fs = require("fs");
let url = prompt("주소 입력 :");
let saveFile = prompt("저장파일명 : ");
request(request, function(err, response, body) {
    if (err || response.statusCode !== 200) {
        console.log("요청 처리시 에러 발생");
        console.log(err);
        return;
    }
    fs.
    console.log(body);
});