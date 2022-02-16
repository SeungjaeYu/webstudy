<%@page import="kr.co.mlec.repository.vo.Board"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	Board b = new Board();
	request.setCharacterEncoding("utf-8");
	dao.deleteBoard(Integer.parseInt(request.getParameter("no")));	
%>	    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="0; url=result.jsp?msg='삭제되었습니다.'">
<title>Insert title here</title>
</head>
<body>

</body>
</html>