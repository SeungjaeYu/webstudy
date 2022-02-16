<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String sDate = sdf.format(new Date());
	Date date = sdf.parse("2019-11-11");
	int year = date.getYear() + 1900
	int month = date.getMonth() + 1
 --%>
 	<fmt:parseDate var="d" value="2019-11-11"
 	               pattern="yyyy-MM-dd" />
 	<div>YEAR : ${d.year + 1900}</div>
 	<div>MONTH : ${d.month + 1}</div>
 	<div>
 		<fmt:formatDate value="${d}" pattern="yyyy-MM" />
 		
 	</div>
</body>
</html>