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
import kr.co.mlec.util.FileUtil;

@WebServlet("/board/delete.do")
public class DeleteBoardController extends HttpServlet {
	
	private BoardDAO dao;
	
	public DeleteBoardController() {
		dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 데이터베이스 처리하기
		dao.deleteBoard(Integer.parseInt(req.getParameter("no"))); 
		res.sendRedirect("list.do");
	}
}











