const app = require("express")();
app.use((req, res, next) => { // next -> 미들웨어가 여러개 일 경우 다음 미들웨어를 참조한다.
    req.msg = "hi~";
    next();
});    
app.use((req, res, next) => {
    req.msg += " middleware";
    next(); // app.get이 next가 된다.
});
app.get("/", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`<h2>${req.msg}</h2>`);
});

app.use((req, res) => {
    res.writeHead(404, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`<h2>404 - Not Found</h2>`);
})   // 응답이 되지 않았을 때 실행됨 - > 위의 res.end가 없음 

app.listen(3000, () => console.log("서버 구동중..."));