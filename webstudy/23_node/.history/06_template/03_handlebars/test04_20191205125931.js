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
                    {firstName: "선우", lastName: "최"},
                    {firstName: "스타", lastName: "김"},
                    {firstName: "도일", lastName: "구"},
                ],
                tel: ["111", ""],
                body: {
                    title: "제목....",
                    content: "내용...."
                }
            })
        );
       
    });
})
.listen(10001);

