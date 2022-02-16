//npm install handlebars
const handlebars = require("handlebars");
const fs = require("fs");
const http = require("http");

http.createServer((req, res) => {
    fs.readFile("./view/test03.hdb", "utf-8", (err, data) => {
        let template = handlebars.compile(data);
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
        res.end(
            template({
                title: "Handlebars 연습",
                body: {
                    
                }
            })
        );
       
    });
})
.listen(10001);

