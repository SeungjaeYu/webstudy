// POST 방식일 경우의 파라미터 처리하기
const http = require("http");
const fs = require("fs");
// POST 방식으로 들어온 파라미터 파싱처리
const qs = require("querystring");
const port = 10001;

http.createServer((req, res) => {
    if (req.url === "/favicon.ico") {
        res.end();
        return;
    }
    console.log(req.method);
    if (req.method === "GET") {
        fs.readFile("data/form.html", "utf-8", (err, data) => {
            if (err) {
                console.log("파일 읽기 중 에러 발생...");
                return;
            }
            res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
            
            res.end(data);
        });
    } else if (req.method === "POST") {
        console.log("POST 요청 들어옴");
        // 파라미터 추출 이벤트
        // 파라미터 추출 중간 호출 : data
        // 파라미터 추출 종료시 호출 : end
        let paramData = "";
        req.on("data", (data) => {
            // 읽은 파라미터 정보를 paramData 변수에 추가한다.
            paramData += data;
        });
        req.on("end", () => {
            console.log("파라미터 내용 : " + r)
            let param = qs.parse(paramData);
            res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
            consle.log(param.jumin1);
            consle.log(param.jumin2);
        });
        res.end();
    }

}).listen(port, () => {
    console.log(`http://localhost:${port} 구동중...`);
});