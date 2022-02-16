const app = require("./express")();

app.get("/");
app.get();
app.port();
app.listen(3000, () => {
    console.log("서버가 시작되었습니다.");
});