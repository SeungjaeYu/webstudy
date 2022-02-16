<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
	<div>
		<form action="write.do">
			<div>
				<label>제목</label>
				<input type="text" name="title" />
			</div>
			<div>
				글쓴이 : ${member.id} 
			</div>
			<div>
				<label>내용</label>
				<textarea name="content" rows="3"></textarea>
			</div>
			<div>
			<button>등록</button>
			<button type="button" 
					onclick="location.href='list.do'">목록</button>
			</div>		
		</form>
	</div>
</div>
</body>
</html>