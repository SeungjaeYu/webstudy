<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>           
<!DOCTYPE html> 
<html>
<head>
  <meta charset='utf-8'>
  <title>자유게시판</title>
	<%@ include file="/jsp/include/cssScript.jsp" %>
</head>
<body>
	<c:import url="/jsp/include/leftmenu.jsp" />
	
	<div class="container">
		<h2>자유게시판</h2>
		<hr />
		<div>번호 : ${board.no}</div>
		<div>글쓴이 : ${board.writer}</div>
		<div>제목 : <c:out value="${board.title}" /></div>
		<div>내용 : <c:out value="${board.content}" /></div>
		<div>등록일 : <fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd HH:mm:ss" /></div>
		<div>조회수 : ${board.viewCnt}</div>
		<div>
		    <a href='updateform.do?no=${board.no}'>수정</a>
		    <a href='delete.do?no=${board.no}'>삭제</a>
		    <a href='list.do'>목록</a>
		</div>
		
		<div id="commentRegistForm">
			<form id="crForm" method="post" action="comment_regist.do">
				<input type="hidden" id="no" value="${board.no}" />	
				<table width="70%">
				<tr>
					<td><input type="text" id="writer" /></td>
					<td><textarea id="content" rows="2" cols="60"></textarea></td>
					<td><input type="submit" value="등록" /></td>
				</tr>	
				</table>
			</form>
		</div>
		<!-- 댓글 목록 -->		
		<div id="commentList"></div>			
	</div>
	<script>
		let no = ${board.no};
	</script>
	<script src="<c:url value='/resources/js/board.js' />"></script>
</body>
</html>





















