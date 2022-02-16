<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.container {
		display: grid;
		grid-template-columns: 1fr 1fr;
	}
	.container > div {
		padding: 30px;
	}
	#result {
		border: 10px solid gray;
		padding: 20px;
		font-size: 20px;
		font-weight: bold;
		color: white;
		background: black;
		height: 400px;
		overflow: auto;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div>
			<h2>Ajax 처리이해</h2>
			<p><a href="<c:url value="/mvc/07ajax/test01.do" />">
					단순 텍스트 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test02.do" />">
					맵 객체 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test03.do" />">
					MemberVO 객체 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test04.do" />">
					List-String 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test05.do" />">
					List-Member 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test06.do" />">
					ResponseEntity - String 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test07.do" />">
					ResponseEntity - Member 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test08.do" />">
					ResponseEntity - List Member 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test09.do" />">
					ResponseEntity - Error 반환
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/test10.do" />">
					파라미터 정보를 JSON 형식의 문자열로 전송
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/member/hong.do" />">
					PathVariable
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/board.do" />" data-method="get">
					GET - 전체조회
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/board.do" />" data-method="post">
					POST - 등록
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/board/5.do" />" data-method="get">
					GET - 게시글 조회
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/board/5.do" />" data-method="delete">
					DELETE - 게시글 삭제
			</a></p>
			<p><a href="<c:url value="/mvc/07ajax/board/5.do" />" data-method="put">
					PUT - 게시글 수정
			</a></p>
		</div>
		<div>
			<h2>Ajax 실행결과</h2>
			<div id="result"></div>
		</div>
	</div>
	<script>
		$("a").click((e) => {
			e.preventDefault();
			let ele = e.target;
			let options = {
				url: $(ele).attr("href")	
			};
			// $(ele).attr("href") -> test10.do 일 경우
			// options 객체에 파라미터 정보 추가
			// Spring 에서 JSON 형식의 문자열을 @RequestBody 어노테이션을 이용해서 설정
			// @RequestBody는 요청바디의 내용을 처리
			if ($(ele).attr("href").endsWith("test10.do")) {
				options["type"] = "POST";  // @RequestBody는 요청바디의 내용을 처리
				options["contentType"] = "application/json";
				options["data"] = JSON.stringify({id: "a", password: "b", name: "홍길동"});
			}
			
			// REST URI 일 경우 요청방식 지정
			if ($(ele).data("method")) {
				options["type"] = $(ele).data("method");
			}
			
			$.ajax(options)
			 .done((data) => {
				 console.log(typeof (data));
				 if (typeof (data) == "string") {
					 $("#result").html(data);
					 return;
				 }
				 $("#result").empty();
				 /*
				 	JSON.stringify : JSON 객체 -> 문자열
				 	JSON.parse : 문자열 -> JSON 객체 변환
				 	let obj = {id: "a", name: "b"};
				 	let str = JSON.stringify(obj);
				 	
				 	let str = "{id: 'a', name: 'b'}";
				 	let obj = JSON.parse(obj);
				 */
				 
				 for (let key in data) {
					 $("#result").append("<h2>" + key + "-" + JSON.stringify(data[key]) + "</h2>");
				 }
			 })
			 .fail(() => {
				 alert("ajax 처리 에러발생");
			 });
		});
	</script>   
</body>
</html>












