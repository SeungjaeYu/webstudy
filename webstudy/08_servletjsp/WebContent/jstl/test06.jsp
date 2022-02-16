<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List<String> list = Arrays.asList(new String[] {"one", "two", "three"});
	pageContext.setAttribute("list", list);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>forEach - 향상된 for 방식</h2>
	<c:set var="cnt" value="1"/>
	<c:forEach var="msg" items="${list}">
		<c:if test="${1 != cnt }">,</c:if>
		${msg}
		<c:set var="cnt" value="${cnt + 1}"/>
	</c:forEach>
	
	
	
	<br />
	<c:forEach var="msg" items="${list}" varStatus="loop">
		<div>${loop.index} ::: ${loop.count} ::: ${loop.first} ::: ${loop.last} ::: ${msg}</div>
		
	</c:forEach>
	<br />
	<c:forEach var="msg" items="${list}" varStatus="loop">
		<c:if test="${loop.first == false}">,</c:if>
		${msg}
	</c:forEach>
	
	
	<!-- 	
	<c:forEach var="msg" items="${list}">
	<c:choose>
		<c:when test="${list[0] eq msg}">
			${msg}
		</c:when>
		<c:otherwise>
			, ${msg}
		</c:otherwise>
	
	</c:choose>
	</c:forEach>
	 -->
	
</body>
</html>