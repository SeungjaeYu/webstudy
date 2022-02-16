<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg"); 
	Date time = (Date)request.getAttribute("time");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Forward 공유 테스트</h2>
	<h2>msg : <%= msg %></h2>
	<h2>time : <%= time %></h2>
</body>
</html>