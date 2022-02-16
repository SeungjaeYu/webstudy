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
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Page;
import kr.co.mlec.util.page.PageResult;

@WebServlet("/board/list3.do")
public class List3Controller extends HttpServlet {
	
	private BoardDAO dao;
	
	public List3Controller() {
		this.dao = MyAppSqlConfig.getSqlSession().getMapper(BoardDAO.class);
	}
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청한 페이지 번호 가져오기 (처음 요청한 경우는 1페이지로)
		int pageNo = request.getParameter("pageNo") == null ? 1 : Integer.parseInt(request.getParameter("pageNo"));
		// 목록 데이터 구하기
		request.setAttribute("list", dao.selectBoard(new Page(pageNo)));	// 게시물 목록
		// 전체 게시물 갯수
		request.setAttribute("pr", new PageResult(pageNo, dao.selectBoardCount()));	// 전체 게시물 갯수
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/board/list3.jsp");
		rd.forward(request, response);
	}
	
}










