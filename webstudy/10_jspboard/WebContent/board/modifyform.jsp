<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="modify.jsp">
		<div>글번호 : <input type="text" name="no" value="<%=request.getParameter("no")%>">	</div>
		제목<input type="text" name="title">
		내용<input type="text" name="content">
		<button type="submit">수정</button>
		<button type="button">취소</button>
	</form>
</body>
</html>