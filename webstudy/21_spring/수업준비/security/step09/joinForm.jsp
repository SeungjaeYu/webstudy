<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	<form method='post' action="<c:url value="/security/join.do" />">
		<div>
			<label>아이디 : </label>
			<input type='text' name='id' value='aaa'></div>
		<div>
			<label>패스워드 : </label>
			<input type='password' name='password' value='1111'>
		</div>
		<div>
			<label>이름 : </label>
			<input type='text' name='name' value='홍길동'>
		</div>
		<div>
			<button>가입</button>
		</div>
	</form>
</body>
</html>