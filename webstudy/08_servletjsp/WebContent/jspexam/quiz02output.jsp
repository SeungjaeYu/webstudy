<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String name = "".equals(request.getParameter("name")) ? "" : "<td>" + request.getParameter("name") + "</td>";
	String phone = "".equals(request.getParameter("phone")) ? "" : "<td>" + request.getParameter("phone") + "</td>";
	String emailAddr = "".equals(request.getParameter("emailAddr")) ? "" : "<td>" + request.getParameter("emailAddr") + "</td>";
	String department = request.getParameter("department") == null ? "선택안함" : request.getParameter("department");
	String[] subject = request.getParameterValues("subject");
	String send = request.getParameter("send");
	String agree = "on".equals(request.getParameter("agree")) ? "동의함" : "동의하지 않음";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
		<th colspan="2">입사 지원 내용</th>
		</tr>
		<tr>
			<td>이름</td>
			<%=name %>
		</tr>
		<tr>
			<td>핸드폰</td>
			<%=phone %>
		</tr>
		<tr>
			<td>이메일주소</td>
			<%=emailAddr %>
		</tr>
		<tr>
			<td>학과</td>
			<td><%=department %></td>
		</tr>
		<tr>
			<td>이수과목</td>
			<td>
			<%if(subject == null) { %>
			입력하지 않음
			<%} else {%>
				<%for (String str : subject)  {%>
					<%=str%>&nbsp;&nbsp;
				<%} %>	
			<%} %>
			</td>
		</tr>
		<tr>
			<td>정보 발송 방법</td>
			<td><%=send %></td>
		</tr>
		<tr>
			<td>정보 발송 여부</td>
			<td><%=agree %></td>
		</tr>
		
	</table>
</body>
</html>