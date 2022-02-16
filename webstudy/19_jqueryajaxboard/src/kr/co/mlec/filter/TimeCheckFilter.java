package kr.co.mlec.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class TimeCheckFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		long s = System.currentTimeMillis();
		chain.doFilter(request, response);
		HttpServletRequest hRequest = (HttpServletRequest)request;
		String uri = hRequest.getRequestURI();
		double time = (System.currentTimeMillis() - s) / 1000d;
		System.out.println(uri + "(실행시간) : " + time);
	}
}











