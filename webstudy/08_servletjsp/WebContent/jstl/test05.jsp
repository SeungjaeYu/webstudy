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
	<%--
		for (int i = 1; i <= 10; i++) {
		
		}
	 --%>
	 <c:forEach var="i" begin="1" end="10">
	 	<div>${i}</div>
	 </c:forEach>
	 <div>
	 년도:
	 <select>
	 	<c:forEach var="year" begin="1960" end="2010">
	 		<option>${year}</option>
	 	</c:forEach>
	 </select>
	 </div>
</body>
</html>