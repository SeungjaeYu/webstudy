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



@WebServlet("/board/modifyform.do")
public class ModifyFormController extends HttpServlet {
	private BoardDAO dao;
	public ModifyFormController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("board", dao.selectOneBoard(Integer.parseInt(req.getParameter("no"))));
		req.getRequestDispatcher("/jsp/board/modifyform.jsp").forward(req, res);
		
	}

}
