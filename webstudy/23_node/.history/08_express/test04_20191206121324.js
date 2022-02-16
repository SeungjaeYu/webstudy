const express = require("express");
const app = express();

// 미들웨어 설정 : 정적 자원 처리
app.use(express.static("public"));

app.get("/", (req, res) => {
    res.w
});