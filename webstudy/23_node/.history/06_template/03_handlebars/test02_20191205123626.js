//npm install handlebars
const handlebars = require("handlebars");
const fs = require("fs");
const http = require("http");


fs.readFile("./view/test01.hdb", "utf-8", (err, data) => {
    let template = handlebars.compile(data);
    console.log(
        template({
            title: "Handlebars 연습",
            body: "<h2>태그를 입력할 경우??</h2>"
        })
    );
});