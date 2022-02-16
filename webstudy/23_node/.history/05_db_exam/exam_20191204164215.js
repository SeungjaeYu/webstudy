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

con.connect();

function queryResult(query, queryType, res, info, queryStr) {
	let resultSet = "";
	switch (queryType) {
		case "selectList" :
			con.query(query, (err, result) => {
				if (err) errDBProcess(err);
				result.forEach(({no, title, writer}) => {
					resultSet += `<tr>
										<td>${no}</td>
										<td><a href="detail.do?no=${no}">${title}</a></td>
										<td>${writer}</td>
									</tr>`;
				});
				send(res,info,resultSet);
			});
			break;
		case "selectOne" :
			console.log(query);
			console.log(queryType);
			console.log(queryStr);

			console.log("str : " + queryStr);
			con.query(query, queryStr, (err, result) => {
				console.log(result);
				console.log(result.title);
				console.log(result.writer);
				console.log(result.content);
				if (err) errDBProcess(err);
				result.forEach(({title, writer, content, no}) => {
					resultSet = {title, writer, content, no};
				});
				send(res,info,resultSet);
			});

			break;
		case "insert" :
		case "delete" : 
		case "update" : 
		console.log(queryStr);
			con.query(query, queryStr, (err) => {
				
				if (err) errDBProcess(err);
				//resultSet = affectedRows;
			});
		break;
	}
	//con.end();
	
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
setMapping("/writeForm.do", "view/board/writeForm.html");
setMapping("/list.do", "view/board/list.html");
setMapping("/detail.do", "view/board/detail.html");

http.createServer((req, res) => {
   if (req.url === "/favicon.ico") {
         res.end();
         return;

	}
   
	let param;
	if (req.url.indexOf("?") != -1 && req.url.indexOf("/detail.do") != -1) {
		param = qs.parse(req.url.substr(req.url.indexOf("?") + 1,req.url.length));
		//console.log(req.url.substr(req.url.indexOf("?")));
		setMapping("/detail.do" + req.url.substr(req.url.indexOf("?"),req.url.length), "view/board/detail.html");
	}
	else if (req.url.indexOf("?") != -1 && req.url.indexOf("/delete.do") != -1) {
		param = qs.parse(req.url.substr(req.url.indexOf("?") + 1,req.url.length));
		setMapping("/delete.do" + req.url.substr(req.url.indexOf("?"),req.url.length), "view/board/delete.html");
	}
	else if (req.url.indexOf("?") != -1 && req.url.indexOf("/update.do") != -1) {
		param = qs.parse(req.url.substr(req.url.indexOf("?") + 1,req.url.length));
		//console.log(req.url.substr(req.url.indexOf("?")));
		setMapping("/detail.do" + req.url.substr(req.url.indexOf("?"),req.url.length), "view/board/detail.html");
	}
	
	let info = mappings[req.url];

   if (req.method === "GET") {
      if (info === undefined) {
            error404(res);
            return;
	  }
	  if (info === "view/board/list.html") {
		  let query = `select * from tb_board order by no desc`;
		  queryResult(query, "selectList",res, info);
		} else if (info === "view/board/detail.html") {
		  let query = `select * from tb_board where no = ?`;
		  queryResult(query, "selectOne", res, info, param.no);
	  } else if (info === "view/board/delete.html") {
		let query = `delete from tb_board where no = ?`;
		queryResult(query, "delete", res, null, [param.no]);
	  } else {
		  send(res, info);
	  }
	 

   } else if (req.method === "POST") {
      let paramData = "";
      req.on("data", (data) => {
		  console.log(data);
          paramData += data;
	  });
      req.on("end", () => {
		  console.log(paramData);
		  if (req.url === "/write.do") {
			let query = `
			insert into tb_board(writer, title, content)
			values (?, ?, ?)
			`;
			let param = qs.parse(paramData);
			queryResult(query, "insert", res, info, [param.title, param.writer, param.content]);
		  }
        
         res.writeHead(302, {"LOCATION":"/list.do"});
         res.end();
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
	  if (fileName ==="view/board/list.html") {
		  data = data.toString().replace(":tbody", resultValue);
	  } else if (fileName == "view/board/detail.html") {
		  data = data.toString().replace(":title", resultValue.title);
		  data = data.toString().replace(":writer", resultValue.writer);
		  data = data.toString().replace(":content", resultValue.content);
		  data = data.toString().replace(/:no/g, resultValue.no);
	  }

      response.end(data);
  });
}

