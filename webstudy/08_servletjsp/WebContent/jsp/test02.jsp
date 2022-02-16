<!-- 
	<%--		--%> : JSP 주석문, JSP Engine이 인식하는 주석문
	<%-- <%@           %> --%> : 지시문
	<%-- <%!			  %> --%> : 선언문.거의 X 변수나 메소드를 전역으로 사용한다. 거의 사용안함. !를 붙이지 않으면 service메소드 안에 선언되고, !가 붙으면 service메소드 밖에 멤버변수나 메소드로 선언된다.
	<%-- <%=			  %> --%> : 표현식, out.println을 대신한다. 출력부분에 쓴다.
	<%-- <%			  %> --%> : 실행문


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
	<%-- JSP 주석문 : JSP 엔진이 주석처리함(.java로 변환내용에 포함되지 않는다.)
					: 따라서 브라우저로 주석내용이 전송되지 않는다.
	 --%>
	<!-- 콘텐트 주석문은 브라우저로 전송은 되지만 브라우저에 출력되지 않는다.  -->
	<h2>주석문 테스트</h2>
	
</body>
</html>