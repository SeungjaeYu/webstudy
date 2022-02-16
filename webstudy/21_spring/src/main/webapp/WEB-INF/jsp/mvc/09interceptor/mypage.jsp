<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="logout.do">로그아웃</a>
	<div>
		<h2>아이디 : ${sessionScope.user.id}</h2>
		<h2>이름 : ${sessionScope.user.name}</h2>
	</div>
</body>
</html>