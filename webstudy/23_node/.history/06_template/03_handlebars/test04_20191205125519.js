//npm install handlebars
const handlebars = require("handlebars");
const fs = require("fs");
const http = require("http");

http.createServer((req, res) => {
    fs.readFile("./view/test04.hdb", "utf-8", (err, data) => {
        let template = handlebars.compile(data);
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
        res.end(
            template({
                title: "Handlebars 연습",
                member: [
                    {},{}
                ],
                body: {
                    title: "제목....",
                    content: "내용...."
                }
            })
        );
       
    });
})
.listen(10001);

