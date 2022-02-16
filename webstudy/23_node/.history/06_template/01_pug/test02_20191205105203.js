/**
 *  1. 태그안에 속성을 여러개 사용할 경우 ","로 구분한다.
 *     form(name="a", method="post")
 *  2. <!DOCTYPE html> 태그를 사용하려면
 *     doctype html
 *  3. div 태그에 id 또는 class 속성을 정의할 때는 div 태그를 생략할 수 있다.
 *     <div id="a"></div> - div(id="a"), #a
 *     <div class="b"></div> - div(class="a"), .b
 *  4. 스크립트 태그 적용
 *     script(src="..")
 *  5. CSS 적용
 *     link(href="...")
 */

const http = require("http");
const pug = require("pug");
const port = 10001;
http.createServer((req, res) => {
    req.
})
.listen(port, () => {
    console.log("http://localhost:${port} 번 구동중...")
});