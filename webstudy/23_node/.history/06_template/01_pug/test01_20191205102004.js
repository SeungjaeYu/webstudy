/**
 *  pug 작성시 주의
 *  - 스페이스와 탭 둘 중 하나만 사용해야 한다.
 *  
 *  작성규칙
 *  0. 자식태그로 지정할 경우 들여쓰기 한다.(탭이나 스페이스 둘중 하나만 써야 한다.)
 *  1. 태그 작성시 이름만 적는다.
 *  2. 태그의 내용을 작성하려 할때는 태그 이름 뒤에 내용을 적는다.
 *      <h2>pug 연습</h2>
 *      h2 pug 연습
 *  3. 태그의 내용을 여러줄 입력하려 할 때는 태그 이름 뒤에 "."을 입력한 뒤에 사용
 *     h2.
 *       hi
 *       hello~~
 *       kkkk~~~
 *  4. 태그의 속성을 사용하려면 태그의 이름뒤에 소괄호를 이용해서 속성을 적는다.
 *     a(href="http://www.naver.com")
 *  
 */
const pug = require("pug");
const fs = require("fs");
const http = require("http");
const port = 10001;

http.createServer((req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    // data 파일의 내용을 html 형식으로 변환
    let data1 = pug.renderFile("./view/test01.pug");    // html 자체를 바꾼값
    let fn = pug.comfileFile();  // function 반환
    res.end(fn());


    /*
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    // data 파일의 내용을 html 형식으로 변환
    //let html = pug.renderFile("./view/test01.pug");
    res.end(pug.renderFile("./view/test01.pug"));
    */
    /*
    fs.readFile("./view/test01.pug","utf-8", (err, data) => {
        if (err) {
            throw err;
        }
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
        // data 파일의 내용을 html 형식으로 변환
        let html = pug.render(data);
        res.end(html);
    });
    */

})
.listen(port, () =>{
    console.log(`http://localhost:${port} 구동중...`);
});