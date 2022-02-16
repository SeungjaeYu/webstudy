const app = require("./express")();

app.get("/", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("");
});
app.get();
app.port();
app.listen(3000, () => {
    console.log("서버가 시작되었습니다.");
});