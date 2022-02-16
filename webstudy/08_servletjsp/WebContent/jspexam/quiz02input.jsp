<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입사지원</h1>
	
	아래 항목을 입력해 주세요.
	<form action="quiz02output.jsp">
	<div>
		<b>개인 정보 : </b> <br/>
		이름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name"> <br/>
		핸드폰&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	<input type="text" name="phone"> <br/>
		이메일 주소&nbsp;&nbsp;&nbsp;	<input type="text" name="emailAddr"> <br/>
	</div>
	<div>
		<b>학과를 선택해 주세요.</b> <br/>
		<input type="radio" name="department" value="컴퓨터공학">컴퓨터공학
		<input type="radio" name="department" value="전자과">전자과
		<input type="radio" name="department" value="수학과">수학과
		<input type="radio" name="department" value="산업공학과">산업공학과
	</div>
	<div>
		<b>이수 과목은 무엇입니까?</b> <br/>
		<input type="checkbox" name="subject" value="EJB">EJB
		<input type="checkbox" name="subject" value="Spring">Spring
		<input type="checkbox" name="subject" value="UML">UML<br/>
		<input type="checkbox" name="subject" value="JDBC">JDBC
		<input type="checkbox" name="subject" value="서블릿">서블릿
		<input type="checkbox" name="subject" value="JSP">JSP
	</div>
	<div>
		정보 발송방법
		<select name="send">
			<option value="이메일">이메일</option> 
			<option value="우편">우편</option> 
		</select>
	</div>
	<div>
		<input type="checkbox" name="agree">개인정보 이용 약관에 동의합니다.
	</div>
	<button>전송</button>
	</form>
</body>
</html>