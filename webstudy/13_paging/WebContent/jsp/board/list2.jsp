<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이징 게시판</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/basic.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<div class="header">
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">페이징 정리</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="<c:url value='/board/list1.do' />">자유게시판1</a></li>
		      <li class="active"><a href="<c:url value='/board/list2.do' />">자유게시판2</a></li>
		      <li><a href="<c:url value='/board/list3.do' />">자유게시판3</a></li>
		    </ul>
		  </div>
		</nav> 
	</div>

	<div class="content">
		<ol class="breadcrumb">
		  <li><a href="#1">Home</a></li>
		  <li class="active">자유게시판2</li>
		</ol>
		<hr>		
		<div class="row">
		    <div class="col-md-10"></div>
		    <div class="col-md-2" style="text-align: right">
				전체 <c:out value="${count}" default="0" />개
		    </div>
		</div>
		<div class="table-responsive">
		<table class="table table-hover">
			<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>등록일</th>
			</tr>
			</thead>
			<c:forEach var="board" items="${list}">
				<tr>
					<td><c:out value="${board.no}" /></td>
					<td><c:out value="${board.title}" /></td>
					<td><c:out value="${board.writer}" /></td>
					<td><fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
				</tr>
			</c:forEach>
			<c:if test="${empty list}">
				<tr>
					<td colspan='4'>입력된 게시물이 없습니다.</td>
				</tr>
			</c:if>
		</table>
		</div>
		
		<%-- 페이지 처리 부분 --%>
		<c:if test="${count ne 0}">
			<nav>
			  <ul class="pagination">
			  <c:if test="${prev}">
			    <li>
			      <a href="list2.do?pageNo=${beginPage - 1}" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			  </c:if>  
			    <c:forEach var="i" begin="${beginPage}" end="${endPage}">			   
			    <li <c:if test="${pageNo eq i}">class="active"</c:if>><a href="list2.do?pageNo=${i}">${i}</a></li>			    
			    </c:forEach>
			    <c:if test="${next}">
			    <li>
			      <a href="list2.do?pageNo=${endPage + 1}" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
			    </c:if>
			  </ul>
			</nav>
		</c:if>
		
		
		<div class="container navbar navbar-inverse bottom">
			<h3>이 페이지는 수업시간에 만들어졌습니다.</h3>
		</div>
	</div>		
</div>
</body>
</html>


















