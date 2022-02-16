<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.BoardDAO"%>
<%@page import="kr.co.mlec.repository.vo.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	BoardDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	Board b = new Board();
	request.setCharacterEncoding("utf-8");
	b.setTitle(request.getParameter("title"));
	b.setWriter(request.getParameter("writer"));
	b.setContent(request.getParameter("content"));
	dao.insertBoard(b);
	
%>			
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="0; url=result.jsp?msg='등록되었습니다.'">
<title>Insert title here</title>
</head>
<body>

</body>
</html>