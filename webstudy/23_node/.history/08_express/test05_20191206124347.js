const express = require("express");
const pug = require("pug");
const bodyParser = require("body-parser");
const app = express();

// 미들웨어 설정
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));



app.get("/", (req, res) => {
    console.log(req.query.msg); 
    res.send(pug.renderFile("views/form.pug"));
});
app.post("/form.do", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`
        <h2>post 파라미터 처리 확인</h2>
        <h2>jumin1 : ${req.body.jumin1}</h2>    // bodyParser라는 미들웨어를 쓸 때
        <h2>jumin2 : ${req.body.jumin2}</h2>
    `);
});

app.listen(3000, () => console.log("서버 구동중..."));