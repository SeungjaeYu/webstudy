package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basic/test05.do")
public class Test05 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		
		String msg = req.getParameter("msg");
		
		
		PrintWriter out = res.getWriter();
		out.println("<h2>GET 응답</h2>");
		out.println("<h2>" + msg + "</h2>");
		out.close();
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		
		String msg = req.getParameter("msg");
		
		PrintWriter out = res.getWriter();
		out.println("<h2>POST 응답</h2>");
		out.println("<h2>" + msg + "</h2>");
		out.close();
		
	}
	

}
