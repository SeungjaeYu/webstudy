/**
 *  파라미터의 모든 정보를 확인하고 싶을때
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test10.do")
public class Test10 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		// 파라미터의 이름만 반환하는 기능
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String[] values = req.getParameterValues(name);
			System.out.print("name : " + name);
			for (String value : values) {
				System.out.println(",value : " + value);					
			}
		}
		
	}
}
