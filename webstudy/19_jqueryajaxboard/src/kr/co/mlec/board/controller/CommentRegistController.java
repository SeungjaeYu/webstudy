package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.vo.Comment;

@WebServlet("/board/comment_regist.do")
public class CommentRegistController extends HttpServlet {

	private BoardDAO dao;
	
	public CommentRegistController() {
		dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		Comment comment = new Comment();
		comment.setNo(no);
		comment.setContent(request.getParameter("content"));
		comment.setWriter(request.getParameter("writer"));
		
		// 게시물 저장 처리 부탁..
		dao.insertComment(comment);
		response.setContentType("application/json; charset=utf-8");
		// 댓글 목록 공유
		List<Comment> commentList = dao.selectComment(no);
		
		PrintWriter out = response.getWriter();
		out.println(new Gson().toJson(commentList));
		out.close();
	}
}











