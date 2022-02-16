/**
 * 
 *  1. 스크립트 코드 사용
 *     - for (let i; ...) {
 * 
 *     - }
 * 
 *  2. 동적 값 전달하기(js 파일에서 pug 파일)
 *     pug.render(data, {title: '값'})
 * 
 *  3. pug 자체 반복구문
 *     each
 * 
 *  4. 주석
 *     //
 *          주석... - 브라우저로 전송 됨
 *     //-
 *          주석....    - 브라우저로 전송 안됨
 * 
 */
const pug = require("pug");
const http = require("http");
http.createServer((req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(
        pug.renderFile(
            "./view/test03.pug", 
            {
                title : "동적 값 적용",
                
            },
        )
    );
});