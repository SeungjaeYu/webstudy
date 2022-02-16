package kr.co.mlec.servlet.forward;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/forward/test02.do")
public class Test02 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Test02 서블릿 호출됨");
		// 공유 데이터 설정
		req.setAttribute("msg", "공유 메세지임..");
		req.setAttribute("time", new Date());
		
		RequestDispatcher rd = req.getRequestDispatcher("test02.jsp");
		rd.forward(req, res);
		
	}
	
}
