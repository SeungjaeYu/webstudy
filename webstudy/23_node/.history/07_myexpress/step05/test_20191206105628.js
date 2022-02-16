const app = require("./express")();

app.use((req, res) => {
    console.log(1);
    req.msg = "a";
});
app.use((req, res) => {
    console.log(2);
    req.msg += "b";
});

app.get("/", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("<h2>msg : ${req.msg}</h2>");
});
app.get("/test", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("<h2>/test 호출 성공</h2>");
});
app.post("/test", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("<h2>/test POST 호출 성공</h2>");
});

app.listen(3000, () => {
    console.log("서버가 시작되었습니다.");
});