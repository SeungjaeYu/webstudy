<%@page import="kr.co.mlec.repository.vo.Board"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.repository.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

BoardDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
Board board = new Board();
board.setNo(Integer.parseInt(request.getParameter("no")));
board.setTitle(request.getParameter("title"));
board.setContent(request.getParameter("content"));

//Board board = dao.selectOneBoard(getInt("수정할 글번호를 입력하세요 : "));
//if (board == null) {
//	System.out.println("해당 게시물이 존재하지 않습니다.");
//	return;
//}
//// 글번호가 존재할때 사용자에게 수정할 내용을 받는다.
//board.setTitle(getString("제목을 입력하세요 : "));
//board.setContent(getString("내용을 입력하세요 : "));
//
dao.updateBoard(board);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="0; url=result.jsp?msg='수정되었습니다.'">
<title>Insert title here</title>
</head>
<body>

</body>
</html>