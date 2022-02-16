// npm install express
const express = require("express");
// 서버 생성
const app = express();

app.get("/", (req, res) => {
    res.send("<h2>Hello~ Express</h2>")
})
