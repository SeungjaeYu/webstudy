package kr.co.mlec.mvc._09interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(
			HttpServletRequest request,
			HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("user");
		if (member != null) {
			return true;
		}
		// session이 없으면 로그인 폼으로 이동시킨다.
		System.out.println("인터셉터에서 로그인 인증에 걸림 ..");
		response.sendRedirect("loginform.do");
		return false;
	}
	
}
