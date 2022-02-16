//npm install handlebars
const handlebars = require("handlebars");
const fs = require("fs");

fs.readFile("./view/test01.hdb", "utf-8", (err, data) => {
    let template = handlebars.compile(data);
    console.log(
        template({
            title: "Handlebars 연습",
            body: "ㅎㅇㅎㅇ"
        })
    );
});