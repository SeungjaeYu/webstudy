<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<%@ include file="/jsp/include/cssScript.jsp" %>
<title>Insert title here</title>
</head>
<body>
<c:import url="/jsp/include/leftmenu.jsp" />
<div class="container">
    <h2>자유게시판</h2>
	<form method='post' action='write.do'>
	 	<div>
  		   제목 : <input type='text' name='title' size='70' />	 	
	 	</div>
	 	<div>
	 		<c:choose>
	 			<c:when test="${empty member}">
			 		글쓴이 : <input type="text" name="writer" />	 			
	 			</c:when>
	 			<c:otherwise>
			 		<input type="hidden" name="writer" value="${member.id}" />
				     글쓴이 : ${member.id}
	 			</c:otherwise>
		     </c:choose>
	 	</div>
	 	<div>
	            내용 : <textarea name='content' rows='7' cols='70'></textarea>
	 	</div>
	    <button type='submit'>등록</button>
	</form>
</div>	
</body>
</html>