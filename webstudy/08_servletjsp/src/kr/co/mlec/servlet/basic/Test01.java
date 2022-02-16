/**
 *  서버 사이드 : 서버 실행한 다음 결과를 클라이언트로 전송, servlet, jsp, js(nodejs), ...
 * 
 *  클라이언트 사이드 : 클라이언트에서 실행, html, css, js...
 *  
 *  서블릿
 *  - .java : 자바클래스
 *  - Servlet 인터페이스 타입이 되어야 한다.(상속관계)
 *    public class MyClass implements Servlet
 *  - Servlet 인터페이스를 상속한 자식 클래스를 상속(GenericServlet(추상), HttpServlet(추상))
 *    public class MyClass extends GenericServlet
 *    public class MyClass extends HttpServlet
 * 
 * 	
 *    Servlet
 *    <- GenericServlet(Servlet 인터페이스 대다수의 메서드를 오버라이딩)
 *    <- HttpServlet(Http 프로토콜과 연관된 메서드가 정의되어 있음)
 * 	  
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *  사용자의 URL 정보와 Text01 서블릿을 연결하는 방법
 * 
 *  2가지 방식 제공
 *  1. web.xml	파일에 등록
 *  2. @WebServlet 어노테이션 활용
 */
public class Test01 implements Servlet {

	@Override
	public void destroy() {}

	@Override
	public ServletConfig getServletConfig() { return null; }

	@Override
	public String getServletInfo() { return null; }

	@Override
	public void init(ServletConfig config) throws ServletException {}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service 호출됨");
	}
	
}
