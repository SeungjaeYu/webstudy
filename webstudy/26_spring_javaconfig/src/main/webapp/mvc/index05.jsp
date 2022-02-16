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
	<h2>컨트롤러 리턴 이해</h2>
	<div>
		<a href="<c:url value="/mvc/05return/test01.do" />">String 리턴</a>
		<a href="<c:url value="/mvc/05return/test02.do" />">void 리턴</a>
		<a href="<c:url value="/mvc/05return/test03.do" />">ModelAndView 리턴</a>
		<a href="<c:url value="/mvc/05return/test04.do" />">View 리턴</a>
	</div>
</body>
</html>












