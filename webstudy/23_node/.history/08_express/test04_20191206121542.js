const express = require("express");
const app = express();

// 미들웨어 설정 : 정적 자원 처리
app.use(express.static("public"));

app.get("/", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`
        <h2>정적 파일 테스트</h2>
        <img src="/images/pic1.jpg" width="400" height="300" />
    `);
});

app.listen(3000, () => "")