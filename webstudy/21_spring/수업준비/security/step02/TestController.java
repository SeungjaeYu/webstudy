package kr.co.mlec.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.security.TestController")
@RequestMapping("/security")
public class TestController {
	
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