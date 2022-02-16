<%--
	지시문
	1. page		: <%@ page 이름="값" ....
	   - contentType - 서블릿 변환시 response.setContentType("이곳에 설정");
	   - import : 자바의 import문을 대체
	2. include  : <%@ include
	3. taglib	: <%@ taglib
 --%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
	List<String> list = new ArrayList<>();
	list.add("one");
	list.add("two");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(String data : list) {
	%>
			<%=	data %>
	<%			
		}
	%>
	
</body>
</html>