package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Member;

@WebServlet("/board/write.do")
public class WriteBoardController extends HttpServlet {
	private BoardDAO dao;
	public WriteBoardController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);
	}
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		Member member = (Member)session.getAttribute("member");
		System.out.println("3333" + req.getParameter("writer"));
		dao.insertBoard(
				new Board().setTitle(req.getParameter("title"))
//						   .setWriter(req.getParameter("writer"))
						   .setWriter(member.getId())
						   .setContent(req.getParameter("content"))
		);
		res.sendRedirect("list.do");
	}
}














