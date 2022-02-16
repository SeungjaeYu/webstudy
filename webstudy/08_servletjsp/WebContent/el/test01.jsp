<%--
	EL : Expression Language
	- jsp 스크립트 요소(스크립트릿, 표현식, 선언문)
	- 표현식(<%= %>)를 대신 사용
	- 자바 클래스의 메서드를 호출하거나 집합 객체(리스트, 배열, ..) 대한 접근 방법을 제공
	- jsp 제공하는 내장객체 중에서 공유영역과 연관된 4가지 객체를 사용한다.
	  pageContext(현재 자신 페이지에서 사용)
	  request(한번의 요청에 대한 공유)
	  session(사용자 별로 공유 - 브라우저별)
	  application(프로젝트(웹어플리케이션) 전체 공유)
	  
	- 구문
	  ${}, (#{} - JSP 2.1 버전부터 사용 가능)
	 당신의 이름은 ${name} 입니다.
	 
	 
	- 연산자
	  : 산술연산자 ( +, -, *, /, %(mod) ) 
	  : 비교연산자 ( ==(eq), !=(ne), <=(le), >=(ge), <, >)
	  : 논리연산자 ( &&(and), ||(or), !(not) )
	  : 삼항연산자 (? : )
	  : empty 연산자
	  	- null은 참
	  	- 문자열일 경우 길이가 0인 경우도 참( "" )
	  	- 배열이나 리스트 크기가 0인 경우 참
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>EL 사용하기</h2>
	<div>5 + 5 = <%= 5 + 5 %></div>	
	<div>5 + 5 = ${ 5 + 5 }</div>	
	<div>5 % 2 = ${ 5 % 2 }</div>	
	<div>5 mod 2 = ${ 5 mod 2 }</div>	
	<div>5 == 2 = ${ 5 == 2 }</div>	
	<div>5 eq 2 = ${ 5 eq 2 }</div>	
	<div>empty "a" = ${ empty "a" }</div>	
</body>
</html>