<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
	String msg = (String)request.getAttribute("msg");
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="2; url=list.do">
<title>Insert title here</title>
	<%@ include file="/jsp/include/cssScript.jsp" %>

</head>
<body>
	<c:import url="/jsp/include/leftmenu.jsp" />

	<h2><%= msg %></h2>
	<h2>2초뒤 목록페이지로 이동합니다.</h2>
	<a href="list.do">목록</a>
</body>
</html>