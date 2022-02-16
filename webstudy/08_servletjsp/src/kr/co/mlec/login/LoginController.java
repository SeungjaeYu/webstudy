package kr.co.mlec.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.common.db.MyAppSqlConfig;

@WebServlet("/session/login.do")
public class LoginController extends HttpServlet {

	private LoginDAO dao;
	
	public LoginController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(LoginDAO.class);
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		Member m = new Member();
		m.setId(id);
		m.setPass(pass);
		Member member = dao.selectLogin(m);
		if (member == null) {
			res.sendRedirect("loginform.do");
			return;
		}
		
		// 로그인 성공 시 메인페이지 이동
		HttpSession session = req.getSession();
		session.setAttribute("member", member);
		res.sendRedirect("main.do");
		
	}
	
}
