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
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/write.do")
public class WriteBoardController extends HttpServlet {
	
	private BoardDAO dao;
	
	
	public WriteBoardController() {
		// proxy 객체
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// 파라미터 한글처리
		req.setCharacterEncoding("utf-8");
		
//		Board board = new Board();
//		
//		board.setTitle(req.getParameter("title"));
//		board.setWriter(req.getParameter("writer"));
//		board.setContent(req.getParameter("content"));
//		dao.insertBoard(board);
		
		dao.insertBoard(new Board().setTitle(req.getParameter("title")).setWriter(req.getParameter("writer"))
				.setContent(req.getParameter("content")));

		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		

		String content = FileUtil.readFile(req.getServletContext().getRealPath("/board/result.html"));
		
		content = content.replace("#msg", "등록되었습니다.");
		out.println(content);
		out.close();

		
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
