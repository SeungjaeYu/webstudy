<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
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
			<div>전체 : ${list.size()}개</div>
			<table class="table table-bordered">
				<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>조회수</th>
					<th>등록일</th>
				</tr>
				</thead>
				<tbody>
				<c:if test="${empty list}">
					<tr>
						<td colspan="5">게시물이 없습니다.</td>
					</tr>				
				</c:if>
				<c:forEach var="b" items="${list}">
				<tr>
					<td>${b.no}</td>
					<td><a href="detail.do?no=${b.no}">${b.title}</a></td>
					<td>${b.writer}</td>
					<td>${b.viewCnt}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${b.regDate}" /></td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
			<div>
				<a href="writeform.do">글쓰기</a>
			</div>
		</div>
	</div>
</body>
</html>








