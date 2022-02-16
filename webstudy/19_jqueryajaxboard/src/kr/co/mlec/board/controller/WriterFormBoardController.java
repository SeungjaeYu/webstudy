package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.util.FileUtil;

@WebServlet("/board/writeform.do")
public class WriterFormBoardController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/jsp/board/writeform.jsp").forward(req, res);
		/*
		RequestDispatcher rd = req.getRequestDispatcher("writeform.jsp");
		rd.forward(req, res);  
		 */
	}
}









