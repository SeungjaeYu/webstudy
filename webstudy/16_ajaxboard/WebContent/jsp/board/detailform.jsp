<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

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
	<form action="modifyform.do" method="post">
	

	
	
		<div>글번호 : <input type="text" name="no" value="<c:out value="${board.no}"/>"/> 작성자 : <input type="text" name="writer" value="<c:out value="${board.writer}"/>"/>
		 작성일 : <input type="text" name="regDate" value=" <fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></div>
		<div>글제목 : <input type="text" name="title" value="<c:out value="${board.title}"/>"/></div>
		<div>조회수 : <input type="text" name="viewCnt" value="<c:out value="${board.viewCnt}"/>"/></div>
		<div>내용 : <textarea name="content"><c:out value="${board.content}"/></textarea></div>
		<div>
			<button type="button" onclick="location.href='modifyform.do?no=${board.no}'">수정</button>
			<button type="button" onclick="location.href='delete.do?no=${board.no}'">삭제</button>
		</div>
	</form>
	<div id="commentRegistForm">
	<form name="crForm" action="comment_regist.do" onsubmit="return commentRegistAjax();">
		<div>
			<input type="hidden" name="no" value="${board.no}">
			<input type="text" name="writer">
			<input type="text" name="content">
			<button>등록</button>
		</div>
	</form>		
	</div>
	<!-- 댓글 목록 -->
	<div id="commentList">
	
		<form>
			<table border=1>
			<c:if test="${empty comment}">
				<tr>
					<td colspan=5>댓글이 존재하지 않습니다.</td>
				</tr>
			</c:if>
			
			<c:forEach var="c" items="${comment}">
				<tr>
					<td>${c.writer}</td>
					<td>
					<c:choose>
						<c:when test="${commentNo eq c.commentNo}">
							<input type="text" name="content" value="<c:out value="${c.content}"/>">
						</c:when>
						<c:otherwise>
							${c.content}
						</c:otherwise>
					</c:choose>
					</td>
					<td><fmt:formatDate value="${c.regDate}" pattern="yyyy-MM-dd HH:mm:ss"/>				</td>
					<td colspan=2><a href="commentDel.do?no=${board.no}&commentNo=${c.commentNo}" >삭제</a>&nbsp;
					<c:choose>
						<c:when test="${commentNo ne c.commentNo}">
							<a href="detailform.do?no=${board.no }&commentNo=${c.commentNo}">수정</a>
						</c:when>
						<c:otherwise>
							<input type="hidden" name="no" value="${board.no}">
						<input type="hidden" name="commentNo" value="${c.commentNo}">
						<button>수정</button>
						</c:otherwise>
					</c:choose>
					</td>
					
				</tr>
			</c:forEach>
			
				
			</table>
		</form>
	</div>
	</div>
	<script>
	let no = ${board.no}
	</script>
	<script src="<c:url value='/resources/js/board.js'/>"></script>
</body>
</html>