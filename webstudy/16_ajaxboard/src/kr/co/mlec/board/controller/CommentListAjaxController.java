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
import kr.co.mlec.repository.dao.CommentDAO;
import kr.co.mlec.repository.vo.Comment;

@WebServlet("/board/comment_list.do")
public class CommentListAjaxController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CommentDAO commentDAO = MyAppSqlConfig.getSqlSessionInstance().getMapper(CommentDAO.class);
		int no = req.getParameter("no") == null ? 0 : Integer.parseInt(req.getParameter("no"));
		List<Comment> commentList = commentDAO.selectComment(no); 
		
		PrintWriter out = res.getWriter();
		out.println(new Gson().toJson(commentList));
		
		
		
		
	}
	
}
