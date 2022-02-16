/**
 * 	클라이언트에서 GET/POST 호출
 *  파라미터 받아서 확인
 *  
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test08.do")
public class Test08 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("GET 메서드 호출 성공");
		// msg 란 이름으로 넘어온 파라미터 꺼내서 확인
		String msg = req.getParameter("msg");
		System.out.println("msg : " + msg);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("POST 메서드 호출 성공");
		// msg 란 이름으로 넘어온 파라미터 꺼내서 확인
		// 한글 깨짐 확인...
		// POST 방식일 경우 파라미터 한글 처리방식...
		// 파라미터를 꺼내기 전에 아래의 설정 추가
		req.setCharacterEncoding("utf-8");
		
		String msg = req.getParameter("msg");
		System.out.println("msg : " + msg);
	}
}
