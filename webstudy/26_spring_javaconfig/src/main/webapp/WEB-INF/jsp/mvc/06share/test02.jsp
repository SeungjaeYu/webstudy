<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test02.jsp 페이지</h2>
	<h2>공유정보</h2>
	<div>id : ${member.id}</div>
	<div>password : ${member.password}</div>
	<div>name : ${member.name}</div>
	<a href="<c:url value="/mvc/index06.jsp" />">돌아가기</a>
</body>
</html>









