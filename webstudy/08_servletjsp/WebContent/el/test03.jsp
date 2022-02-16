<%--
	- EL 에서 객체 찾기
	${id}
	${param}
	
	- 객체(id, param) 찾는 순서
	1. EL 에서 제공하는 기본객체에서 동일한 이름을 찾는다.
	   pageContext(jsp 제공되는 내장객체와 동일) - 다른 내장객체에 접근할 수 있게 해준다.
	   pageScope	- pageContext 공유 영역 접근
	   requestScope - request 공유 영역 접근
	   sessionScope - session 공유 영역 접근
	   applicationScope - application 공유 영역 접근
	   param - request.getParameter을 대체
	   paramValues - request.getParameterValues 대체
	   cookie - 상태정보 관리 Cookie 객체를 접근
	   ...
	   
	2. 1번에서 못찾은 경우 jsp의 4가지 공유영역에 설정된 값들에서 찾는다.  
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>객체 찾기 - 1</h2>
	<div>id : <%= request.getParameter("id") %></div>
	<div>id : ${param.id}</div>

</body>
</html>