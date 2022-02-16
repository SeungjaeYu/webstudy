const app = require("express")();
app.get("/", () => { console.log("메인 URL 호출") });
app.get("/board/list.do", () => { console.log("list URL 호출") });
app.get("/board/write-form.do", () => { console.log("write-form URL 호출") });
app.get("/board/write-form.do", () => { console.log("write-form URL 호출") });