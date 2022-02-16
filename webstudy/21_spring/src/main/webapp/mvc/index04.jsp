<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파라미터 처리 - 파일</h2>
	<form method="post" enctype="multipart/form-data" action="<c:url value="/mvc/file/upload01.do" />">
		<input type="text" name="msg" value="test" />
		<input type="file" name="attach" />
		<button>업로드</button>
	</form>
	
	<form method="post" enctype="multipart/form-data" action="<c:url value="/mvc/file/upload02.do" />">
		<input type="text" name="msg" value="test" />
		<input type="file" name="attach" multiple="multiple"/>
		<button>업로드</button>
	</form>
	
	<form method="post" enctype="multipart/form-data" action="<c:url value="/mvc/file/upload03.do" />">
		<input type="text" name="msg" value="test" />
		<input type="file" name="attach1" multiple="multiple"/>
		<input type="file" name="attach2" multiple="multiple"/>
		<button>업로드</button>
	</form>
</body>
</html>