package kr.co.mlec.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/test.do")
public class Test extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		
		// 세션 객체 얻기
		HttpSession session = req.getSession();
		String id = session.getId();
		
		session.setMaxInactiveInterval(3);
		
		out.println("<h2>JSESSIONID : " + id + "</h2>");
		out.close();
		
	}
	
}
