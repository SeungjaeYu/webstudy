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
import kr.co.mlec.repository.dao.CommentDAO;
import kr.co.mlec.repository.vo.Comment;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/comment_delete.do")
public class DeleteCommentAjaxController extends HttpServlet {
	private CommentDAO dao;
	public DeleteCommentAjaxController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Comment comment = new Comment();
		comment.setNo(Integer.parseInt(req.getParameter("no")));
		comment.setCommentNo(Integer.parseInt(req.getParameter("commentNo")));
		
		dao.deleteComment(comment);
		
		CommentDAO commentDAO = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
		int no = req.getParameter("no") == null ? 0 : Integer.parseInt(req.getParameter("no"));
		List<Comment> commentList = commentDAO.selectComment(no); 
		
		PrintWriter out = res.getWriter();
		out.println(new Gson().toJson(commentList));
		
		
		
		
		
	}
	

}
