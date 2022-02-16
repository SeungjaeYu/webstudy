package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.dao.CommentDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/comment_update.do")
public class ModifyCommentController extends HttpServlet {
	private CommentDAO dao;
	public ModifyCommentController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		Comment comment = new Comment();
		comment.setNo(Integer.parseInt(req.getParameter("no")));
		comment.setCommentNo(Integer.parseInt(req.getParameter("commentNo")));
		comment.setContent(req.getParameter("content"));
		dao.updateComment(comment);

		res.sendRedirect("detailform.do?no=" + Integer.parseInt(req.getParameter("no")));
	}

}
