<%@page import="java.text.SimpleDateFormat"%>
<%@page import="kr.co.mlec.repository.vo.Board"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	Board b = dao.selectOneBoard(Integer.parseInt(request.getParameter("no")));
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자유게시판</h2>
	<form action="modifyform.jsp" method="post">
	

	
	
		<div>글번호 : <input type="text" name="no" value="<%=b.getNo()%>"/> 작성자 : <input type="text" name="writer" value="<%=b.getWriter()%>"/> 작성일 : <input type="text" name="regDate" value="<%=sdf.format(b.getRegDate())%>"></div>
		<div>글제목 : <input type="text" name="title" value="<%=b.getTitle()%>"/></div>
		<div>조회수 : <input type="text" name="viewCnt" value="<%=b.getViewCnt()%>"/></div>
		<div>내용 : <textarea name="content"><%=b.getContent()%></textarea></div>
		<div>
			<button type="button" onclick="location.href='modifyform.jsp?no=<%=b.getNo()%>'">수정</button>
			<button type="button" onclick="location.href='delete.jsp?no=<%=b.getNo()%>'">삭제</button>
		</div>
	</form>
</body>
</html>