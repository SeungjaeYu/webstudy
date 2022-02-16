/*
    사용자 요청 URL에 따라서 아래와 같이 처리하는 프로그램 작성
    - "/" 라면 board/index.html 파일의 내용을 읽어서 응답
    - "/writeForm.do" 라면 board/writeForm.html 파일의 내용을 읽어서 응답
    - "/write.do" 라면 전송된 파라미터의 내용을 읽어서 화면에 출력한다.
       목록 링크를 클릭 시 list.do 페이지를 호출하도록 한다.
       등록된 내용
       제목 : ㅁㅁㅁㅁ
       글쓴이 : ㅁㅁㅁㅁ
       내용 : ㅁㅁㅁㅁㅁ
       <a ... >목록</a>
    - "/list.do" 라면 board/list.html 파일의 내용을 출력한다.
    - 만약, 위의 url 외의 호출이 오면 error404.html 페이지의 내용 출력 
 */

const fs = require("fs");
const http = require("http");
const port = 10001;
let mappings = [];
let setMapping = (url, fileName) => mappings[url] = fileName;
const qs = require("querystring");

setMapping("/", "board/index.html");
setMapping("/writeForm.do", "board/writeForm.html");
setMapping("/list.do", "board/list.html");

http.createServer((req, res) => {
   if (req.url === "/favicon.ico") {
         res.end();
         return;
   }
   let info = mappings[req.url];
   if (req.method === "GET") {
      if (info === undefined) {
            error404(res);
            return;
      }

      send(res, info);

   } else if (req.method === "POST") {
      let paramData = "";
      req.on("data", (data) => {
           paramData += data;
      });
      req.on("end", () => {
            let param = qs.parse(paramData);
            res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
            res.end(`
               <h2>제목 : ${param.title}</h2>
               <h2>글쓴이 : ${param.writer}</h2>
               <h2>내용 : ${param.content}</h2>
               <a href="list.do">목록</a>
            `);
      });
   }
}).listen(port, () => {
   console.log("서버 구동중");
});


let error404 = (response) => {
   response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
   send(response, "error404.html")
};

function send(response, fileName) {
   
   fs.readFile(fileName, (err, data) => {
      if (err) {
          response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
          response.end("<h1>처리중 에러 발생</h1>");
          return;
      }
      response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
      response.end(data);
  });
}





