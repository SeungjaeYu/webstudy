<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test07.jsp 페이지</h2>
	<h2>msg1 : ${msg1}</h2>
	<h2>msg2 : ${param.msg2}</h2>
	<a href="<c:url value="/mvc/index06.jsp"/>"> 돌아가기</a>
</body>
</html>