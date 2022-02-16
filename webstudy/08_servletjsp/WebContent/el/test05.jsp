<%--
	EL의 객체 표현 이해하기
	객체.이름
	객체의 타입이 VO 또는 맵 클래스인 경우
	board.no -> board.getNo()
	board.title -> board.getTitle()
	
	맵 인 경우
	boardMap.no -> boardMap.get("no");
	
 --%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, String> data = new HashMap<>();
	data.put("id", "hong");
	data.put("name", "홍길동");
	data.put("msg", "다들 모여라~");
	pageContext.setAttribute("data", data);
	

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객체가 맵인 경우</h2>
	<div>data : ${data}</div>
	<div>data.id : ${data.id}</div>
	<div>data.name : ${data.name}</div>
	<div>data.msg : ${data.msg}</div>
	<div>data.addr : ${data.addr}</div>

</body>
</html>