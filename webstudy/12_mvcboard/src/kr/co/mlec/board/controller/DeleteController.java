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
public class DeleteController extends HttpServlet {
	private BoardDAO dao;
	public DeleteController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	
		dao.deleteBoard(Integer.parseInt(req.getParameter("no")));
		
		
		res.sendRedirect("list.do");
		
		
//		int result = dao.deleteBoard(Integer.parseInt(req.getParameter("no")));
//		if (result == 1) {
//			System.out.println();
//			System.out.println("게시글이 삭제되었습니다.");
//			return;
//		}
//		System.out.println("해당 게시물이 존재하지 않습니다.");
	}
	

}
