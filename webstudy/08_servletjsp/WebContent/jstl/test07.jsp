<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
// 		pageContext.getRequest().getContextPath(*);
// 		pageContext.request.contextPath;
	%>

	<%-- 프로젝트(웹어플리케이션) 경로 가져오기 --%>
	<div><%= request.getContextPath() %>/board/list.do</div>
	<div>${pageContext.request.contextPath}/board/list.do</div>
	<div><c:url value="/board/list.do" /></div> <!-- c url 태그가 프로젝트 경로를 알아서 추가해 준다. -->
	<div><c:url value="list.do" /></div> <!-- 상대 경로일 경우에는 주지 프로젝트 경로를 주지 않는다. -->
</body>
</html>