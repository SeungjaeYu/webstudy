<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test01.jsp</h2>
	<hr />
	<%--
		지시자 인클루드 방식
		: 소스코드를 가져와서 합치는 방식
		: 파라미터를 넘겨주지 못한다(sample.jsp?msg=hello => 파일의 경로로 인식하기 때문에 불가능)
		: 변수를 같이 사용할 수 있다.
	 --%>
	<%@ include file="sample.jsp" %>
	<%= msg %>
	<hr />
</body>
</html>