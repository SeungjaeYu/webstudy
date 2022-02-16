<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>데이터 공유 이해</h2>
	<div>
		<a href="<c:url value="/mvc/06share/test01.do?id=a&password=1&name=홍길동" />">
			HttpServletRequest 이용한 공유
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/06share/test02.do?id=a&password=1&name=홍길동" />">
			매개변수를 일반클래스로 선언 
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/06share/test03.do?id=a&password=1&name=홍길동" />">
			@ModelAttribute 사용 
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/06share/test04.do?id=a&password=1&name=홍길동" />">
			Model 사용 
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/06share/test05.do?id=a&password=1&name=홍길동" />">
			Map 사용 
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/06share/test06.do" />">
			Redirect 를 이용한 데이터 공유
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/06share/test07.do" />">
			직접 호출
		</a>
	</div>
</body>
</html>












