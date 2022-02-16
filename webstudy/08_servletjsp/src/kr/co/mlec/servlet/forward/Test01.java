/**
 *  forward 사용하기
 */
package kr.co.mlec.servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/forward/test01.do")
public class Test01 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/*
		 *  forward 방식 사용
		 *  1. RequestDispatcher 객체 얻기(HttpServletRequest 객체의 메서드 활용)
		 *     - req.getRequestDispatcher("이동할 페이지 주소 설정")
		 *     - "/"를 사용해서 주소 설정할 경우 웹어플리케이션(프로젝트) 패스 경로 제외하고 적는다.
		 *  2. 페이지를 이동하는 기능 사용
		 *     - RequestDispatcher.forward(req, res)   
		 */
//		RequestDispatcher rd = req.getRequestDispatcher("/aaa"); // 프로젝트 밑에 aaa경로를 찾는다.
		// /servlet/forward/test01.do 호출하기 위해서
		// http://localhost:port/프로젝트경로/servlet/forward/test01.do
		// /servlet/forward/test01.jsp 호출하기 위해서
		// http://localhost:port/프로젝트경로/servlet/forward/test01.jsp
//		RequestDispatcher rd = req.getRequestDispatcher("test01.jsp");
		System.out.println("서블릿 호출됨...");
		RequestDispatcher rd = req.getRequestDispatcher("/servlet/forward/test01.jsp");
		
		rd.forward(req, res);
	}
	
}


