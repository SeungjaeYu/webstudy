const express = require("express");
const board = require("./board");

const app = express();
app.use("/board", board);

app.get("/", (req, res) => {
    res.send("<h2>메인페이지 호출</h2>")
});

app.listen(3000, () => console.log("서버 구동중..."));