const app = require("./express")();
const fs = require("fs");



app.get("/", (req, res) => {
    fs.readFile("test.html", (err, data) => {
        if (err) throw err;
        res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
        res.end(data);
    });
});
app.get("/test", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`
        <h2>파라미터 정보</h2>
        <h2>name : ${req.body.name}</h2>
        <h2>age : ${req.body.age}</h2>
    `);
});
app.post("/test", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("<h2>/test POST 호출 성공</h2>");
});

app.listen(3000, () => {
    console.log("서버가 시작되었습니다.");
});