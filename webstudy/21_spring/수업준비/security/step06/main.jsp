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
	<h2>메인페이지</h2>
	<c:choose>
		<c:when test="${not empty pageContext.request.userPrincipal}">
			<p>${pageContext.request.userPrincipal.name}</p>
			<a href="<c:url value="/security/logout.do" />">로그아웃</a>
		</c:when>
		<c:otherwise>
			<a href="<c:url value="/security/login-form.do" />">로그인</a>
		</c:otherwise>
	</c:choose>
	<a href="<c:url value="/security/index.jsp" />">돌아가기</a>	     	
</body>
</html>