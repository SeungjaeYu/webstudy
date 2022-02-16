<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자유게시판</h2>
	<div>
		<form action="write.jsp">
			<div>
				<label>제목</label>
				<input type="text" name="title" />
			</div>
			<div>
				<label>글쓴이</label>
				<input type="text" name="writer" />
			</div>
			<div>
				<label>내용</label>
				<textarea name="content" rows="3"></textarea>
			</div>
			<div>
			<button>등록</button>
			<button type="button" 
					onclick="location.href='list.jsp'">목록</button>
			</div>		
		</form>
	</div>

</body>
</html>