<%--
	EL의 객체 표현 이해하기
	객체.이름
	객체의 타입이 VO 또는 맵 클래스인 경우
	board.no -> board.getNo()
	board.title -> board.getTitle()
	
	맵 인 경우
	boardMap.no -> boardMap.get("no");
	
 --%>

<%@page import="kr.co.mlec.el.Memo"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Memo memo = new Memo();
	memo.setNo(1);
	memo.setStatus("d");
	memo.setContent("마동석 - 길가매쉬");
	pageContext.setAttribute("memo", memo);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객체가 VO인 경우</h2>
	<div>memo : ${memo}</div>
	<div>memo.no : ${memo.no}</div>
	<div>memo.content : ${memo.content}</div>
	<%-- title은 존재하지 않으므로 에러발생
	<div>memo.title : ${memo.title} --%>
	<div>memo.status : ${memo.status}</div>

</body>
</html>