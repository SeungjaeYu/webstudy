<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<h2>RequestMapping의 기본 호출 방식 이해</h2>
	<div>
		<a href="<c:url value="/mvc/requestmapping/test01.do"/>">requestmapping - 1</a>
	</div>
	
	<div>
		<a href="<c:url value="/mvc/requestmapping/test02.do"/>">requestmapping - 2</a>
	</div>
	
	<div>
		<a href="<c:url value="/mvc/requestmapping/test03.do"/>">requestmapping - 3</a>
	</div>
	
	<div>
		<a href="<c:url value="/mvc/requestmapping/test04.do"/>">requestmapping - 4</a>
	</div>
	
	<div>
		<a href="<c:url value="/mvc/requestmapping/test05.do"/>">requestmapping - 5</a>
	</div>
	
	<div>
		<a href="<c:url value="/mvc/requestmapping/test06.do"/>">requestmapping - 6(GET)</a>
	</div>
	<form method="post" action="<c:url value="/mvc/requestmapping/test06.do"/>">
		<div>
			<button>requestmapping - 6(POST)</button>
		</div>
	</form>
	<h2>RequestMapping 기본 호출 방식 - 2</h2>
	<div id="content">
		<div>
			<a href="#1" data-type="application/json">application/json 호출</a>
		</div>
		<div>
			<a href="#2" data-type="application/x-www-form-urlencoded">application/x-www-form-urlencoded 호출</a>
		</div>
		<div>
			<a href="#3" data-type="text/plain">text/plain 호출</a>
		</div>
	</div>
	<script>
		$("#content > div > a").click((e) => {
			let aTag = e.target;
			let type = $(aTag).data("type");
// 			alert(type);
			$.ajax({
				url: "<c:url value="/mvc/requestmapping/test07.do" />",
				headers: {
					"Content-type": type
				}
			});
			
		});
	</script>
	
</body>
</html>