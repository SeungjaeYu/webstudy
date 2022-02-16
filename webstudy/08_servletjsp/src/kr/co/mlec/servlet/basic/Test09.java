/**
 *  radio, checkbox 파라미터 이해하기
 *  - 사용자가 값을 선택하지 않으면 아무런 값도 전송되지 않는다.
 *  - 파라미터의 값이 null 로 넘어온다.
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test09.do")
public class Test09 extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String sms = req.getParameter("sms");
		// 여러개가 동일한 이름으로 넘어오는 경우 getParameterValues		
//		String dinner = req.getParameter("dinner");
		String[] dinner = req.getParameterValues("dinner");
		System.out.println("sms : " + sms);
		if (dinner != null) {
			for (String data : dinner) {
				System.out.println("dinner : " + data);
			}			
		} else {
			System.out.println("저녁메뉴 선택하지 않음");
		}
	}
}
