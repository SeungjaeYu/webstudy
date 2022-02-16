package kr.co.mlec.mvc._09interceptor;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.mvc._09interceptor.Test")
@RequestMapping("/mvc/09interceptor")
public class Test {
	@RequestMapping("/loginform.do")
	public void loginform() {}
	
	@RequestMapping("/login.do")
	public String login(HttpSession session) {
		Member m = new Member();
		m.setId("aaa");
		m.setName("에이");
		m.setPassword("1234");
		session.setAttribute("user", m);
		return "redirect:mypage.do";
	}
	
	@RequestMapping("/mypage.do")
	public void mypage() {}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginform.do";
	}
	
	
	
}
