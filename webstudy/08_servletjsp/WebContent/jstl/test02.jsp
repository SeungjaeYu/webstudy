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
	<%--
		out : 출력 태그
	 --%>
	<h2>출력 : out</h2>
	<div><c:out value="hello~" /></div>
	<div>${"hello~"}</div>
	<c:set var="msg" value="<h2>hello~</h2>"/>
	<div><c:out value="${msg}" /></div>
	 <div>${msg}</div>
	 
	<div><c:out value="${homepage}" default="등럭된 홈페이지가 없습니다." /></div>
</body>
</html>