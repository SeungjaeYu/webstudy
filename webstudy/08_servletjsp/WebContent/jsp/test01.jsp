<!--
	JSP -> .java(서블릿파일로 변환) 	-> .class 		-> 객체 생성 	-> init 	-> service 
	---------------- JSP Engine ----------------- 		   -------- 기존 서블릿 호출방식 ------
	
	.jsp의 내용은 변환된 서블릿 파일의 service 메서드 안에 포함된다.
	service 메서드에 선언된 변수를 .jsp 파일내에서 접근해서 사용할 수 있다.
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSP 페이지 호출하기</h2>
</body>
</html>