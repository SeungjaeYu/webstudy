package kr.co.mlec.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mlec.login.service.LoginService;
import kr.co.mlec.repository.vo.Member;


@Controller("kr.co.mlec.login.controller.LoginController")
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("/login.do")
	public String login(Member m, HttpSession session) {
		
		Member member = service.selectLogin(m);
		// 로그인 실패
		if (member == null) {
			return "redirect:loginform.do";
		}
		// 로그인 성공 시 메인페이지 이동
		session.setAttribute("member", member);
		return "redirect:/main.do";
	}
	
	@RequestMapping("/loginform.do")
	public void loginForm() {}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		// 세션을 무효화시킨다.
		session.invalidate();
		return "redirect:/main.do";
	}
	
}












