const app = require("express")();
app.use(() =);
app.use();
app.get("/", (req, res) => {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end(`<h2>req.msg</h2>`);
});