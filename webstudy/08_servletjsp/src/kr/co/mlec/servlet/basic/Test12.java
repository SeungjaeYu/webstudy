package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 	http://localhost:8000/08_servletjsp/servlet/basic/test12.do
@WebServlet("/servlet/basic/test12.do")
public class Test12 extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// ServletContext : WebApplication을 표현하는 자바 클래스
		String contextPath = req.getContextPath();
		System.out.println("contextPath : " + contextPath);
		String method = req.getMethod();
		System.out.println("method : " + method);
		String uri = req.getRequestURI();
		System.out.println("uri : " + uri);
		
		System.out.println("요청패스 : " + uri.substring(contextPath.length()));
		
	}

}
