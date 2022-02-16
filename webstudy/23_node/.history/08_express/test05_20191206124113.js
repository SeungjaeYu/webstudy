const express = require("express");
const pug = require("pug");
const bodyParser = require("body-parser");
const app = express();

// 미들웨어 설정
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

app.get("/", (req, res) => {
    res.send(pug.renderFile("views/form.pug"));
});
app.post("/form.do", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`
        <h2>post </h2>
    `);
});

app.listen(3000, () => console.log("서버 구동중..."));