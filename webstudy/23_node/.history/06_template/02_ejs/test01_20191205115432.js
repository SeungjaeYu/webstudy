const http = require("http");
const fs = require("fs");
const ejs = require("ejs");

http.createServer((req, res) => {
    fs.readFile("./view/test01.ejs")
})
.listen(10001);