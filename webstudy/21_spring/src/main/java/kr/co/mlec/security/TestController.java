package kr.co.mlec.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mlec.security.vo.Member;

@Controller("kr.co.mlec.security.TestController")
@RequestMapping("/security")
public class TestController {
	
	@Autowired
	private MemberServiceImpl service;
	
	@RequestMapping("/join-form.do")
	public String joinForm() {
		return "security/joinForm";
	}
	
	@RequestMapping("/join.do")
	public String join(Member member) {
		service.join(member);
		return "redirect:/security/main.do";
	}
	
	@RequestMapping("/main.do")
	public void main() {
		System.out.println("main");
	}	
	
   	@RequestMapping("/login-form.do")
	public String loginForm() {
		return "security/loginForm";
	}
	
	@RequestMapping("/all.do")
	public void all() {
		System.out.println("all");
	}
	@RequestMapping("/user.do")
	public void user() {
		System.out.println("user");
	}
	@RequestMapping("/admin.do")
	public void admin() {
		System.out.println("admin");
	}
}