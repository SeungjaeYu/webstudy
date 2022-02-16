<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	<h2>
		<c:out value="${error}" />
	</h2>
	<form method='post' action="<c:url value="/login" />">
		<div>
			<label>아이디 : </label>
			<input type='text' name='username' value='admin'></div>
<!-- 			<input type='text' name='userId' value='admin'></div> -->
		<div>
			<label>패스워드 : </label>
			<input type='password' name='password' value='1111'>
		</div>
		<div>
			<button>로그인</button>
		</div>
<%-- 		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> --%>
	</form>
</body>
</html>