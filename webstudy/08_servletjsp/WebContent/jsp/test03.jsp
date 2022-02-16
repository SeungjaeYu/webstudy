<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%---
		실행문 : 실행할 자바코드를 작성하는 스크립트문
		표현식 : 출력할 부분을 명시
	 --%>
	 <%
	 	String msg = "Hello";
	 	System.out.println("msg : " + msg);
	 %>
	 <%= msg %>
</body>
</html>