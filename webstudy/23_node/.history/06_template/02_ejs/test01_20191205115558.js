const http = require("http");
const fs = require("fs");
const ejs = require("ejs");

http.createServer((req, res) => {
    fs.readFile("./view/test01.ejs", "utf-8", (err, data) => {
        if (err) {
            throw err;
            let result = data;
            ejs.render()
        }
    });

})
.listen(10001);