const fs = require("fs");
let msg = "쾌우석 개쌉변태";
fs.writeFile("test07.txt", msg, "utf-8", (err) => {
    if (err) {
        console.log("파일 쓰기 중 에러 발생");
        console.log(err);
        return;
    }
    console.log("파일 비동기 쓰기 성공");

});
letfs.writeFileSync("test07.txt", msg, "utf-8");