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
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/update.do")
public class ModifyController extends HttpServlet {
	private BoardDAO dao;
	public ModifyController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		Board board = new Board();
		board.setNo(Integer.parseInt(req.getParameter("no")));
		board.setTitle(req.getParameter("title"));
		board.setContent(req.getParameter("content"));
		
//		Board board = dao.selectOneBoard(getInt("수정할 글번호를 입력하세요 : "));
//		if (board == null) {
//			System.out.println("해당 게시물이 존재하지 않습니다.");
//			return;
//		}
//		// 글번호가 존재할때 사용자에게 수정할 내용을 받는다.
//		board.setTitle(getString("제목을 입력하세요 : "));
//		board.setContent(getString("내용을 입력하세요 : "));
//		
		dao.updateBoard(board);
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		

		String content = FileUtil.readFile(req.getServletContext().getRealPath("/board/result.html"));
		
		content = content.replace("#msg", "수정되었습니다.");
		out.println(content);
		out.close();
		
		
		
		
//		
//		System.out.println();
//		System.out.println("게시글이 수정되었습니다.");	
	}

}
