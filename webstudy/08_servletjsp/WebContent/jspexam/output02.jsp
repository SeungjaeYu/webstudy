<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int dan = Integer.parseInt(request.getParameter("dan"));
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<th style="padding-left: 30px; padding-right: 30px;">단</th>
			<th style="padding-left: 30px; padding-right: 30px;">값</th>
		</tr>
		<% for (int i = 1; i < 10; i++) {
		%>			
		<tr>
			<td style="padding-left: 30px; padding-right: 30px;"><%=dan %> * <%= i %></td>
			<td style="padding-left: 30px; padding-right: 30px;"><%= dan * i %></td>
		</tr>
		<% 
		}
		%>

		
	</table>
	<a href="input02.jsp">다시입력</a>
</body>
</html>