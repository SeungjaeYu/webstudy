<%@page import="kr.co.mlec.repository.vo.Memo"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemoDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(MemoDAO.class);
	dao.deleteAllMemo();
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="0; url=index.jsp">
<title>Insert title here</title>
</head>
<body>

</body>
</html>