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
import kr.co.mlec.repository.vo.Comment;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/commentDel.do")
public class DeleteCommentController extends HttpServlet {
	private CommentDAO dao;
	public DeleteCommentController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Comment comment = new Comment();
		comment.setNo(Integer.parseInt(req.getParameter("no")));
		comment.setCommentNo(Integer.parseInt(req.getParameter("commentNo")));
	
		dao.deleteComment(comment);
		
		
		res.sendRedirect("detailform.do?no=" + Integer.parseInt(req.getParameter("no")));
		
		
//		int result = dao.deleteBoard(Integer.parseInt(req.getParameter("no")));
//		if (result == 1) {
//			System.out.println();
//			System.out.println("게시글이 삭제되었습니다.");
//			return;
//		}
//		System.out.println("해당 게시물이 존재하지 않습니다.");
	}
	

}
