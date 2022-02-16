package kr.co.mlec.board.controller;



import java.io.IOException;
import java.io.PrintWriter;

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



@WebServlet("/board/writeform.do")
public class WriteFormBoardController extends HttpServlet {
	
	private BoardDAO dao;
	
	
	public WriteFormBoardController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		
		
//		Board b = new Board();
//		b.setTitle(getString("제목을 입력하세요 : "));
//		b.setContent(getString("내용을 입력하세요 : "));
//		// 로그인 정보에 있는 이름으로 작성자를 설정한다.
//		b.setWriter(loginId);
		
//		dao.insertBoard(b);

		
		out.println(FileUtil.readFile(req.getServletContext().getRealPath("/board/writeform.html")));
		out.close();
//		System.out.println();
//		System.out.println("게시글이 등록되었습니다.");
	}
	
	

}
