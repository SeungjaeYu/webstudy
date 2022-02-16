<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%@ include file="/jsp/include/cssScript.jsp" %>


</head>
<body>
	<c:import url="/jsp/include/leftmenu.jsp" />
	<div class="container">
	<h2>자유게시판</h2>
	<form action="modify.do">
		<input type="hidden" name="no" value="${board.no}">
		<div>제목<input type="text" name="title" value="<c:out value="${board.title}"/>"> </div>
		<div>내용<input type="text" name="content" value="<c:out value="${board.content}"/>"> </div>
		<button type="submit">수정</button>
		<button type="button" onclick="javascript:history.go(-1);">취소</button>
	</form>
	</div>
</body>
</html>