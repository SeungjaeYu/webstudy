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
		<form action="test04.do" method="post" enctype="multipart/form-data">
			<div><input type="text" name="msg" /></div>
			<div><input type="file" name="attach1" /></div>
			<div><input type="file" name="attach2" /></div>
			<div><button>전송</button></div>
		</form>
	</div>
</body>
</html>






