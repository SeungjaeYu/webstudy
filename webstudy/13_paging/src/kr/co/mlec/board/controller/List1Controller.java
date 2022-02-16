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

@WebServlet("/board/list1.do")
public class List1Controller extends HttpServlet {
	
	private BoardDAO dao;
	
	public List1Controller() {
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
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/board/list1.jsp");
		rd.forward(request, response);
	}
	
	public static void main(String[] args) {
		for (int count = 0; count < 100; count++) {
			// 마지막 페이지 구하기
			int p1 = (count % 10 == 0) ? count / 10 : count / 10 + 1;
			//   77 / 10d -> ceil(7.7) : 8.0
			int p2 = (int)Math.ceil(count / 10d);
			System.out.println(count + "-" + p1 + "-" + p2);
		}
	}
}










