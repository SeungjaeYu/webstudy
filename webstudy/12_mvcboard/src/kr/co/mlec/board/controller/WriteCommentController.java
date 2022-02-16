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

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.dao.CommentDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/writeComment.do")
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
		

		res.sendRedirect("detailform.do?no=" + Integer.parseInt(req.getParameter("no")));
		
		
//		req.setAttribute("msg", "등록되었습니다.");
//		req.getRequestDispatcher("result.jsp").forward(req, res);

		
//		System.out.println();
//		System.out.println("게시글이 등록되었습니다.");
		
		
		
		
		
//		ServletContext context = req.getServletContext();
//		String path = context.getRealPath("/board/list.html");
//		System.out.println(path);
//		// list.html 파일의 내용을 읽어서 #count, #tdata 부분을 변경한다.
//		String content = FileUtil.readFile(path);
//		
//		out.println(content);
//		out.close();

	}
	
	

}
