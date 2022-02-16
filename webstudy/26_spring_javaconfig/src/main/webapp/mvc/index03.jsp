<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<h2>파라미터 처리 방식 이해</h2>
	<div>
		<a href="<c:url value="/mvc/param/test01.do?id=aaa&password=1111&name=홍길동" />">param - 1</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/param/test02.do?id=aaa&password=1111&name=홍길동" />">param - 2</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/param/test02.do?id=aaa&password=1111" />">
			@RequestParam 사용 - name 생략시
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/param/test03.do?id=aaa&password=1111" />">
			@RequestParam 사용 - name 생략시(required=false)
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/param/test04.do?password=1111" />">
			@RequestParam 사용 - name 생략시(defaultValue 속성)
		</a>
	</div>
	<div>
		<a href="<c:url value="/mvc/param/test05.do?id=aaa&password=1111" />">
			매개변수 이름으로 파라미터 처리
		</a>
	</div>	
	<div>
		<a href="<c:url value="/mvc/param/test06.do?id=aaa&password=1111&name=홍길동&age=15" />">
			매개변수 VO 처리
		</a>
	</div>	
	<div>
		<a href="<c:url value="/mvc/param/test07.do?birthDate=2010-11-11&id=aaa&password=1111&name=홍길동&age=15" />">
			매개변수 VO 처리 - 날짜 데이터 추가
		</a>
	</div>	
</body>
</html>





















































