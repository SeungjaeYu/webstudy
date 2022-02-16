const http = require("http");
const fs = require("fs");
const ejs = require("ejs");

http.createServer((req, res) => {
    fs.readFile("./view/test01.ejs", "utf-8", (err, data) => {
        if (err) {
            throw err;
        }
        let result = ejs.render(data);
        res.writeHead(200, {"Content-Type" : "text/html; charset = utf-8"});
        res.end(result)
    });

})
.listen(10001);