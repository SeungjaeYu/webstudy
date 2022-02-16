/**
 *  HttpServletResponse 클래스의 주요 메서드
 * 
 *  setContentType(브라우저에게 전송되는 문서의 타입을 알려준다.);
 *  setContentType("text/html; charset=utf-8");
 *  
 *  전송할 내용을 출력하기 위해서
 *  PrintWriter getWriter();
 *  
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test06")
public class Test06 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		res.setContentType("text/html; charset=utf-8");
		res.setContentType("text/plain; charset=utf-8");
		res.setContentType("text/xml; charset=utf-8");
		// 브라우저가 알지못하는 형식을 설정하게 되면 다운로드됨..
		res.setContentType("taxt/html; charset=utf-8");
		
		PrintWriter out = res.getWriter();
		out.println("<h1>성공 - success</h1>");
//		out.println("<family><me>짱구</me></family>");
		out.close();
	}
}
