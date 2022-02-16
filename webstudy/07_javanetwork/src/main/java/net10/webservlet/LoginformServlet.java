package net10.webservlet;

import java.io.PrintWriter;

import web.util.FileUtil;
import web.util.HttpServlet;
import web.util.HttpServletRequest;
import web.util.HttpServletResponse;
import web.util.ServletException;

public class LoginformServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			String content = FileUtil.readFile("WebContent/html/loginform.html");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println(content);
			out.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
