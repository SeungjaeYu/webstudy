const fs = require("fs");
let msg = "쾌우석 개쌉변태";
fs.writeFile("test07.txt", msg, "utf-8", (err) => {
    if (err) {
        console.log("")
        return;
    }

});
fs.writeFileSync();