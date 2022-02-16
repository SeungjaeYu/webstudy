package kr.co.mlec.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.vo.Comment;

@WebServlet("/board/detail.do")
public class DetailBoardController extends HttpServlet {

	private BoardDAO dao;
	
	public DetailBoardController() {
		dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 게시물 상세 정보 조회하기
		int no = Integer.parseInt(req.getParameter("no"));
		dao.updateViewCnt(no);
		/*
		Board board = dao.selectOneBoard(no); 
		req.setAttribute("board", board);
		*/
		req.setAttribute("board", dao.selectOneBoard(no));
		
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/board/detail.jsp");
		rd.forward(req, res);
	}
}











