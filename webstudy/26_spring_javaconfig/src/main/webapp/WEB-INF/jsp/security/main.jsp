<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>메인페이지</h2>
	<sec:authorize access="isAnonymous()">
		<a href="<c:url value="/security/login-form.do" />">로그인</a>
		<a href="<c:url value="/security/join-form.do" />">회원가입</a>		
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		<div>principal : <sec:authentication property="principal"/></div>
		<div><sec:authentication property="principal.member"/></div>
		<div><sec:authentication property="principal.member.name"/></div>
		<div><sec:authentication property="principal.member.authList"/></div>

		<sec:authentication property="principal.member" var="m" />
		<div>${m}</div>
		<div>${m.name}</div>
		<div>${m.authList}</div>
		<c:forEach var="a" items="${m.authList}">
			<div>${a.auth}</div>
		</c:forEach>
		<a href="<c:url value="/security/logout.do" />">로그아웃</a>
	</sec:authorize>  
	<a href="<c:url value="/security/index.jsp" />">돌아가기</a>	   
</body>
</html>








