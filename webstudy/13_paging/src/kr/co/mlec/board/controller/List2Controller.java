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

@WebServlet("/board/list2.do")
public class List2Controller extends HttpServlet {
	
	private BoardDAO dao;
	
	public List2Controller() {
		this.dao = MyAppSqlConfig.getSqlSession().getMapper(BoardDAO.class);
	}
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청한 페이지 번호 가져오기 (처음 요청한 경우는 1페이지로)
//		String sPageNo = request.getParameter("pageNo") == null ? "1" : request.getParameter("pageNo");
		int pageNo = request.getParameter("pageNo") == null ? 1 : Integer.parseInt(request.getParameter("pageNo"));
		
		Page page = new Page(pageNo);
		System.out.println("요청 페이지 번호 : " + pageNo);
		System.out.println("요청 페이지 시작 번호 : " + page.getBegin());
		System.out.println("요청 페이지 종료 번호 : " + page.getEnd());
		
		
		// 목록 데이터 구하기
		List<Board> list = dao.selectBoard(page);
		// 전체 게시물 갯수
		int count = dao.selectBoardCount();
		
		// 마지막 페이지
		int lastPage = (int)Math.ceil(count / (double)page.getListSize());
		
		request.setAttribute("list", list);	// 게시물 목록
		request.setAttribute("count", count);	// 전체 게시물 갯수
		request.setAttribute("lastPage", lastPage);	// 마지막 페이지
		request.setAttribute("pageNo", pageNo);	// 요청한 페이지
		
		// 목록 하단의 페이지 블럭 구하기
		int tabSize = 10;
		int currTab = (pageNo - 1) / tabSize + 1; 
		int beginPage = (currTab - 1) * tabSize + 1;
		int endPage = currTab * tabSize;
		if (endPage > lastPage) endPage = lastPage;
		
		boolean prev = beginPage != 1;
		boolean next = endPage != lastPage;
		
		request.setAttribute("beginPage", beginPage);	// 시작 페이지 번호
		request.setAttribute("endPage", endPage);	// 종료 페이지 번호
		request.setAttribute("prev", prev);	// 이전이 있는지
		request.setAttribute("next", next);	// 다음이 있는지
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/board/list2.jsp");
		rd.forward(request, response);
	}
	
}










