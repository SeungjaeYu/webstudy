<%@page import="kr.co.mlec.repository.vo.Memo"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	MemoDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(MemoDAO.class);
	List<Memo> list = dao.selectMemo();
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<head>
		<meta charset="utf-8">
		<title>TodoMVC</title>
		<link rel="stylesheet" href="css/memo/base.css">
		<link rel="stylesheet" href="css/memo/index.css">
		<link rel="stylesheet" href="css/memo/app.css">
	</head>
	<body>
		<section class="todoapp">
			<header class="header">
				<h1>todos</h1>
				<form action="write.jsp" method="post">
					<input type="text" class="new-todo" placeholder="오늘의 할일을 적으세요?" name="content" autofocus>
				</form>
			</header>
			<section class="main">
				<ul class="todo-list">
				<% for (Memo memo : list) {
					
				%>
				<li>
					<div class="view">
						<label><%=memo.getContent() %></label>
						<a href="memodel.jsp?no=<%=memo.getNo() %>" class="destroy"></a>
					</div>
					<input class="edit" value="<%=memo.getContent()%>">
				</li>		
				
				<%					
				} %>
							
					
				</ul>
			</section>
			<footer class="footer">
				<span class="todo-count">전체 <strong><%=list.size() %></strong>개</span>
				<a href="memoalldel.jsp" class="clear-completed">전체 지우기</a>
			</footer>
		</section>
	</body>
</body>
</html>