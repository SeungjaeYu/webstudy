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
import javax.servlet.http.HttpSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Member;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/write.do")
public class WriteBoardController extends HttpServlet {
	
	private BoardDAO dao;
	
	
	public WriteBoardController() {
		// proxy 객체
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
//		Board board = new Board();
//		
//		board.setTitle(req.getParameter("title"));
//		board.setWriter(req.getParameter("writer"));
//		board.setContent(req.getParameter("content"));
//		dao.insertBoard(board);
		HttpSession session = req.getSession();
		Member member = (Member)session.getAttribute("member");
		dao.insertBoard(new Board().setTitle(req.getParameter("title")).setWriter(member.getId())
				.setContent(req.getParameter("content")));

		res.sendRedirect("list.do");
		
		
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
