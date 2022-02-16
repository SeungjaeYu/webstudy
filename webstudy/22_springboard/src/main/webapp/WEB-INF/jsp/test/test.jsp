<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>다중 선택 입력 테스트</h2>
	<form method="post"
		  action="${pageContext.request.contextPath}/test/process.do">
		<div>
			<input type="text" name="msg" value="test" /> 
		</div>  
		<div>aaa :
			<input type="checkbox" name="aaa" value="1" />
			<input type="checkbox" name="aaa" value="2" checked />
			<input type="checkbox" name="aaa" value="3" />
			<input type="checkbox" name="aaa" value="4" checked />
		</div>
		<div>bbb :
			<input type="checkbox" name="bbb" value="1" />
			<input type="checkbox" name="bbb" value="2" checked />
			<input type="checkbox" name="bbb" value="3" />
			<input type="checkbox" name="bbb" value="4" checked />
		</div>
		<div>
			<button>전송</button>
		</div>
	</form>
	
</body>
</html>