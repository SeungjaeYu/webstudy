<%--
	객체가 집합객체 인 경우
	- 배열이나 리스트 ..
	
 --%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] arr = {"one", "two", "three"};
	List<String> list = new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	pageContext.setAttribute("arr", arr);
	pageContext.setAttribute("list", list);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객체가 배열 또는 리스트일 경우</h2>
	<div>arr[0] : ${arr[0]}</div>
	<div>arr[1] : ${arr[1]}</div>
	<div>arr[2] : ${arr[2]}</div>
	<div>list : ${list}</div>
	<div>list[0] : ${list[0]}</div>
	<div>list[1] : ${list[1]}</div>
	<div>list[2] : ${list[2]}</div>
	
</body>
</html>