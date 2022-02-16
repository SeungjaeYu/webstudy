/**
 * Filter 인터페이스를 상속받는다.
 * 
 * 핵심메서드
 * - init : 메모리에 올라갈때 최초 한번만 실행 : 톰켓이 웹어플리케이션을 메모리에 로딩시 같이 생성됨..
 * - doFilter : 호출될 때 마다 실행
 * 
 * 특정 서블릿 또는 특정 URL pattern과 연결해서 사용(설정)
 * - web.xml 등록
 * - 어노테이션을 활용
 */
package kr.co.mlec.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class One implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("One-init 호출됨..");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("One-doFilter 시작");
		// 연결된 다음 실행될 자원을 호출
		chain.doFilter(request, response);
		System.out.println("One-doFilter 종료");
	}
	
}
