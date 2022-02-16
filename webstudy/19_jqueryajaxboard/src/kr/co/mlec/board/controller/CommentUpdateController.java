package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.vo.Comment;

@WebServlet("/board/comment_update.do")
public class CommentUpdateController extends HttpServlet {

	private BoardDAO dao;
	
	public CommentUpdateController() {
		dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Comment comment = new Comment();
		comment.setContent(request.getParameter("content"));
		comment.setCommentNo(Integer.parseInt(request.getParameter("commentNo")));
		dao.updateComment(comment);
		
		PrintWriter out = response.getWriter();
		out.println(new Gson().toJson(dao.selectComment(Integer.parseInt(request.getParameter("no")))));
		out.close();
	}
}











