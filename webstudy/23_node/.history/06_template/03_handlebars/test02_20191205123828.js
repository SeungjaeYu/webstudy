//npm install handlebars
const handlebars = require("handlebars");
const fs = require("fs");
const http = require("http");

http.createServer((req, res) => {
    fs.readFile("./view/test02.hdb", "utf-8", (err, data) => {
        let template = handlebars.compile(data);
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"})
        console.log(
            template({
                title: "Handlebars 연습",
                body: "<h2>태그를 입력할 경우??</h2>"
            })
        );
    });
})
.listen(10001);

