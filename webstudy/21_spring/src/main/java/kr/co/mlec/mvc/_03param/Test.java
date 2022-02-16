package kr.co.mlec.mvc._03param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("kr.co.mlec.mvc._03param.Test")
@RequestMapping("/mvc/param")
public class Test {
	
	@RequestMapping("/test01.do")
	public String test01(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		return "redirect:/mvc/index03.jsp";
	}
	
	
	@RequestMapping("/test02.do")
	public String test02(
				@RequestParam("id") String id,
				@RequestParam("password") String password,
				@RequestParam("name") String name
			) {
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		return "redirect:/mvc/index03.jsp";
	}
	
	@RequestMapping("/test03.do")
	public String test03(
			@RequestParam("id") String id,
			@RequestParam("password") String password,
			@RequestParam(value="name", required=false) String name 	//required=false => 선택적으로 파라미터 받을 수 있음
			) {
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		return "redirect:/mvc/index03.jsp";
	}
	
	@RequestMapping("/test04.do")
	public String test04(
			@RequestParam(value="id", defaultValue="hong") String id,
			@RequestParam("password") String password,
			@RequestParam(value="name", required=false) String name 	//required=false => 선택적으로 파라미터 받을 수 있음
			) {
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		return "redirect:/mvc/index03.jsp";
	}
	
	@RequestMapping("/test05.do")
	public String test05(String id, String password, String name, Integer age) {
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		return "redirect:/mvc/index03.jsp";
	}
	
	@RequestMapping("/test06.do")
	public String test06(Member m) {
		System.out.println("id : " + m.getId());
		System.out.println("password : " + m.getPassword());
		System.out.println("name : " + m.getName());
		System.out.println("age : " + m.getAge());
		return "redirect:/mvc/index03.jsp";
	}
	
	@RequestMapping("/test07.do")
	public String test07(Member m) {
		System.out.println("id : " + m.getId());
		System.out.println("password : " + m.getPassword());
		System.out.println("name : " + m.getName());
		System.out.println("age : " + m.getAge());
		System.out.println("birthDate : " + m.getBirthDate());
		return "redirect:/mvc/index03.jsp";
	}
}
