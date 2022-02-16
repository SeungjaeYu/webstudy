<%--
	el 객체를 공유영역에서 찾을 때 순서
	pageContext -> request -> session -> application 의 순으로 찾는다.
	만약, 여러 공유 영역에 동일한 이름으로 등록되어 있다면, 
	각각의 공유영역에 접근하는 EL 기본객체를 이용해서 원하는 공유영역에 접근..
	
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 데이터 공유는 일반적으로 서블릿에서 하게 됨...
	pageContext.setAttribute("msg", "hello");
	pageContext.setAttribute("name", "hong");
	request.setAttribute("name", "kim");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객체 찾기 - 공유영역</h2>
	<div>msg : ${msg}</div>
	<%--
		JSP 2.2 버전 부터 객체의 메서드를 직접 호출 가능
	 --%>
	<div>name : ${name}</div>
	<div>name.length() : ${name.length()}</div>
	<div>name.substring(1) : ${name.substring(1)}</div>
	<div>name : ${requestScope.name}</div>
</body>
</html>