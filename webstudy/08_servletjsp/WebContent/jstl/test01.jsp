<%--
	JSTL(JSP Standard Tag Library)
	- JSP 자체 제공되는 문법 아님..
	- 개발자들이 개별적으로 태그를 만들어 사용(커스텀 태그) 것들 중에서 자주 사용되는 태그들을 표준으로 만들어서 제공
	
	- JSTL을 프로젝트에서 사용하기 위해서
	  : 라이브러리 다운받아서 WEB-INF/lib 폴더에 넣는다.
	  : 태그 사용시 라이브러리의 위치를 알려주는 prefix를 붙여서 사용한다.
	    ex( <prefix:태그명 />
	  : 태그에 prefix를 사용하기 위해서 taglib 지시자를 이용해서 선언이 되어야 한다. 
	  
	- JSTL 태그의 종류
	  : 1. core - 페이지 구현시 필수로 사용되는 기능(98% 정도...)   		
	  : 2. fmt - 날짜(SimpleDateFormat 역활), 숫자, 국제화 관련)		
	  : 3. functions - String 클래스의 기능..  		
	  : 4. sql - 거의 사용 안함..(XML 라이브러리 대체, DAO... )  		
	  : 5. xml - 거의 사용 안함..(Javascript... )  		
 --%>
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
	<%--
		pageContext.setAttribute("msg", "test");
		request.setAttribute("msg", "test");
		session.setAttribute("msg", "test");
		application.setAttribute("msg", "test");
		
		set 태그
		scope : page | request | session | application // 속성을 주지 않으면 default는 page
		var : aaa
		value : bbb 
	 --%>
	<c:set scope="page" var="msg" value="test"/>
	<div>msg : ${msg}</div>
	<h2>page 영역에 cnt 이름으로 1을 설정</h2>
	<c:set scope="page" var="cnt" value="1" />
	<div>page cnt : ${cnt}</div>
	<h2>request 영역에 cnt 이름으로 100을 설정</h2>
	<c:set scope="request" var="cnt" value="100" />
	<div>request cnt : ${requestScope.cnt}</div>
	<h2>page 영역의 cnt의 값을 1 증가시킨다.</h2>
	<c:set scope="page" var="cnt" value="${cnt + 1}" />
	<div>page cnt : ${cnt}</div>
</body>
</html>