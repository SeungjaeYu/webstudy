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
		req.getRequestDispatcher("/jsp/board/writeform.jsp").forward(req, res);
//		System.out.println();
//		System.out.println("게시글이 등록되었습니다.");
	}
	
	

}
