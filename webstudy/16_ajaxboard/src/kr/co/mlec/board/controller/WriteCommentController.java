package kr.co.mlec.board.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.dao.CommentDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/comment_regist.do")
public class WriteCommentController extends HttpServlet {
	
	private CommentDAO dao;
	
	
	public WriteCommentController() {
		// proxy 객체
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		Comment comment = new Comment();
		
		comment.setNo(Integer.parseInt(req.getParameter("no")));
		comment.setWriter(req.getParameter("writer"));
		comment.setContent(req.getParameter("content"));
		dao.insertComment(comment);
		
		
		CommentDAO commentDAO = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
		int no = req.getParameter("no") == null ? 0 : Integer.parseInt(req.getParameter("no"));
		List<Comment> commentList = commentDAO.selectComment(no); 
		
		PrintWriter out = res.getWriter();
		out.println(new Gson().toJson(commentList));
		
		
	}
	
	

}
