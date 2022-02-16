const app = require("express")();
app.use((req, res, next) => { // next -> 미들웨어가 여러개 일 경우 다음 미들웨어를 참조한다.

    next();
});    
app.use((req, res, next) => {
    next(); // app.get이 next가 된다.
});
app.get("/", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`<h2>req.msg</h2>`);
});

app.use()   // 응답이 되지 않았을 때 실행됨