<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test02.jsp</h2>
	<hr />
	<%--
		실행된 결괄를 가져와 합치는 방식
		: 변수 같이 사용 불가능
		: 파라미터를 넘길 수 있다.
	 --%>
	<jsp:include page="sample.jsp" />
	<hr />
	<jsp:include page="sample.jsp">
		<jsp:param value="test" name="msg1" />
		<jsp:param value="테스트" name="msg2" />
	</jsp:include>
	
</body>
</html>