package kr.co.mlec.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.annotation.Controller;
import org.springframework.web.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.WebConstants;
import org.springframework.web.servlet.WebUtil;

import kr.co.mlec.login.service.LoginService;
import kr.co.mlec.repository.vo.Member;


@Controller
public class LoginController {
	private LoginService service;
	public LoginController () {
		this.service = new LoginService();
	}
	
	
	@RequestMapping("/login/login.do")
	public String login(Member member, HttpServletRequest req) {
		
		service.selectLogin(member);
		// 로그인 실패
		if (member == null) {
			return WebConstants.REDIRECT + "loginform.do";
		}
		// 로그인 성공 시 메인페이지 이동
		HttpSession session = req.getSession();
		session.setAttribute("member", member);
		return WebConstants.REDIRECT + req.getContextPath() + "/main.do";
	}
	
	@RequestMapping("/login/loginform.do")
	public void loginForm() {}
	
	@RequestMapping("/login/logout.do")
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		// 세션을 무효화시킨다.
		session.invalidate();
		return WebConstants.REDIRECT + req.getContextPath() + "/main.do";
	}
	
}












