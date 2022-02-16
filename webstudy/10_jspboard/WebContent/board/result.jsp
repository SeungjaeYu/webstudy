<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="2; url=list.jsp">
<title>Insert title here</title>
</head>
<body>
	<h2><%=request.getParameter("msg") %></h2>
	<h2>2초뒤 목록페이지로 이동합니다.</h2>
	<a href="list.jsp">목록</a>
</body>
</html>