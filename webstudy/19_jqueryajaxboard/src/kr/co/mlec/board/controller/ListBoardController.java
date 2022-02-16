package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

@WebServlet("/board/list.do")
public class ListBoardController extends HttpServlet {
	
	private BoardDAO dao;
	
	public ListBoardController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}

	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		// 데이터를 구하고 공유
		req.setAttribute("list", dao.selectBoard());
		// 사용할 화면으로 이동하기
		req.getRequestDispatcher("/jsp/board/list.jsp").forward(req, res);
	}
}







