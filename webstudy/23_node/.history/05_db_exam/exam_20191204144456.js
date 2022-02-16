/*
	// 사용할 모듈 정리
	1. http (웹 서버 기능) 
	2. fs (파일 내용 읽기)
	3. mysql (데이터베이스 접근)
	4. querystring (파라미터 처리)
	
	게시판 기능중에서 등록폼, 등록, 목록 
	
	/writeForm.do 일 경우 writeForm.html 파일의 내용을 읽어서 사용자에게 전송
	
	/write.do 일 경우 넘어온 파라미터 값을 얻어온 다음 데이터베이스에 입력
	
	등록된 다음 자동으로 /list.do 경로를 호출(아래 코드 사용)
	: response.writeHead(302, {"Location": "list.do"}); 
	
	/list.do 일 경우 데이터베이스의 게시물 내용을 조회한 다음 
	사용자 화면으로 결과를 넘겨준다.
 */



const fs = require("fs");
const http = require("http");
const port = 10001;
const mysql = require("mysql");
const con = mysql.createConnection({
	host: "localhost",
	user: "bit2019",
	password: "bit2019",
	database: "bitdb"
});


function queryResult(query, queryType, res, info, queryStr) {
	con.connect();
	let resultSet = "";
	switch (queryType) {
		case "selectList" :
			con.query(query, (err, result) => {
				if (err) errDBProcess(err);
				result.forEach(({no, title, writer}) => {
					resultSet += `<tr>
										<td>${no}</td>
										<td>${title}</td>
										<td>${writer}</td>
									</tr>`;
				});
				send(res,info,resultSet);
			});
			break;
		case "selectOne" :
			con.query(query, queryStr, (err, {no, title, writer}) => {
				if (err) errDBProcess(err);
				resultSet = `<tr>
								<td>${no}</td>
								<td>${title}</td>
								<td>${writer}</td>
							</tr>`;

			});
			break;
		case "insert" :
		case "delete" : 
		case "update" : 
			con.query(query, queryStr, (err, {affectedRows}) => {
				if (err) errDBProcess(err);
				resultSet = affectedRows;
			});
		break;
	}
	con.end();
	
}

function errDBProcess(err) {
	console.log("DB 작업중 에러 발생");
	console.log(err);
	throw err;
}

let mappings = [];
let setMapping = (url, fileName) => mappings[url] = fileName;
const qs = require("querystring");

setMapping("/", "view/index.html");
setMapping("/writeForm.do", "board/writeForm.html");
setMapping("/list.do", "view/board/list.html");

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
	  if (info === )
	  let query = `select * from tb_board order by no desc`;
	  queryResult(query, "selectList",res, info);
	 

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

function send(response, fileName, resultValue, redirectURL) {
   
   fs.readFile(fileName, (err, data) => {
      if (err) {
          response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
          response.end("<h1>처리중 에러 발생</h1>");
          return;
      }
	  response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
	  console.log(resultValue);
	  if (fileName ==="view/board/list.html") {
		  data = data.toString().replace(":tbody", resultValue);
	  }

      response.end(data);
  });
}

