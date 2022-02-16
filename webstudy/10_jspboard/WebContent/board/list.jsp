<%@page import="java.text.SimpleDateFormat"%>
<%@page import="kr.co.mlec.repository.vo.Board"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	BoardDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	List<Board> list = dao.selectBoard();
	int count = list.size();
	
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<h2>자유게시판</h2>
	<div>
		<div>전체 : <%=list.size() %>개</div>
		<table>
			<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>조회수</th>
				<th>등록일</th>
			</tr>
			</thead>
			<tbody>
			<% 
				if (list.isEmpty()) {
			%>		<tr><td colspan='5'>게시물이 없습니다.</td></tr>
			<% }
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
				for (Board b : list) {
			%>
					<tr>
					<td><%= b.getNo() %></td>
					<td> <a href="detailform.jsp?no=<%= b.getNo()%>"><%= b.getTitle() %></a></td>
					<td><%= b.getWriter()%></td>
					<td><%= b.getViewCnt()%></td>
					<td><%= sdf.format(b.getRegDate())%> </td>
					</tr>
			<% }			
			%>
			</tbody>
		</table>
	</div>
	<div>
		<a href="writeform.jsp">글쓰기</a>
	</div>
</body>
</html>