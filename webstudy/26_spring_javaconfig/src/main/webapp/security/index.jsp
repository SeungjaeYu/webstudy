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
	<h2>스프링 security 테스트</h2>
	<div><a href="<c:url value="/security/main.do" />">메인페이지</a></div>
	<div><a href="<c:url value="/security/all.do" />">전체사용자</a></div>
	<div><a href="<c:url value="/security/user.do" />">일반 인증 사용자</a></div>
	<div><a href="<c:url value="/security/admin.do" />">관리자 인증 사용자</a></div>
</body>
</html>