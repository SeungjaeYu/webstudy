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
	<h2>test03.jsp</h2>
	<hr />
	<c:import url="sample.jsp" /> 
	<hr /> 
	<c:import url="sample.jsp">
		<c:param name="msg1" value="로그인" />
		<c:param name="msg2" value="테스트" />
	</c:import> 
</body>
</html>