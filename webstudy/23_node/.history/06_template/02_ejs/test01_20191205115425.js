const http = require("http");
const fs = require("fs");
const ejs = require("ejs");

http.createServer((req, res) => {
    fs.readFile("./view/")
})
.listen(10001);