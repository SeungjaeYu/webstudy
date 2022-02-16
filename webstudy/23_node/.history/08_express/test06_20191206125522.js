const express = require("express");
const board = require("./board");

const app = express();
app.use("/board", board)


app.listen(3000, () => console.log("서버 구동중..."));