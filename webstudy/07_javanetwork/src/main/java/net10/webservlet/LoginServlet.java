package net10.webservlet;

import java.io.PrintWriter;

import web.util.FileUtil;
import web.util.HttpServlet;
import web.util.HttpServletRequest;
import web.util.HttpServletResponse;
import web.util.ServletException;

public class LoginServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			System.out.println("id : " + id);
			System.out.println("password : " + password);
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println(FileUtil.readFile("WebContent/html/loginform.html"));
			out.close();
			
		} catch (Exception e) {}
		
		
	}

}
