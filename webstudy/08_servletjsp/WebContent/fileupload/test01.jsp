<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 업로드 예제</h2>
	<div>
		<%--
			파일 업로드 규칙..
			1. method = "post"
			2. enctype="multipart/form-data" 
			   : 서버로 파일의 내용을 전송하기 위해서 필수로 설정해야 함..
		 --%>
		<form action="test01.do" method="post" enctype="multipart/form-data">
			<div><input type="text" name="msg" /></div>
			<div><input type="file" name="attach1" /></div>
			<div><input type="file" name="attach2" /></div>
			<div><button>전송</button></div>
		</form>
	</div>
</body>
</html>






