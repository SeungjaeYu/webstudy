/**
 *  서블릿과 URI 연결
 *  - 어노테이션 활용 : @로 시작, @WebServlet, uri 설정시 "/"로 시작하도록 설정..
 *  - 클래스 위에 설정   
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/basic/test03.do")
public class Test03 extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("WebServlet 호출 확인");
	}

}
