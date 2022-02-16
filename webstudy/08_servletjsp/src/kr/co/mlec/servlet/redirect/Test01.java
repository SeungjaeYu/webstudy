package kr.co.mlec.servlet.redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/redirect/test01.do")
public class Test01 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/*
		 * 	redirect는 응답 객체를 활용한다.
		 * 
		 *  res.sendRedirect("이동할 페이지 주소");
		 *  - "/"로 이동할 페이지 주소를 설정할 경우 "/웹어플리케이션 경로 포함 해야 한다."
		 *  - 응답코드를 302로 설정
		 *  - Location 헤더 항목을 추가한다.(sendRedirect에 설정한 페이지 주소를 설정)
		 *  
		 */
		System.out.println("페이지 이동 서블릿");
		// 웹어플리케이션 경로는 동적으로 처리되도록 코딩...
		res.sendRedirect(req.getContextPath() + "/servlet/redirect/test01.jsp");
		
	}
	
}
