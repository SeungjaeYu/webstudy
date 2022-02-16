package kr.co.mlec.mvc._02requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.mvc._02requestmapping.Test")
@RequestMapping("/mvc/requestmapping")
public class Test {
	@RequestMapping("/test01.do")
	public String test01() {
		System.out.println("test01 호출");
		return "redirect:/mvc/index02.jsp";
	}
	// 앞의 "/"를 생략할 수 있다.
	@RequestMapping("test02.do")
	public String test02() {
		System.out.println("test02 호출");
		return "redirect:/mvc/index02.jsp";
	}

//	@RequestMapping(value="test03.do")
	@RequestMapping(path="test03.do")
	public String test03() {
		System.out.println("test03 호출");
		return "redirect:/mvc/index02.jsp";
	}

	@RequestMapping(value= {"test04.do", "test05.do"})
	public String test045() {
		System.out.println("test045 호출");
		return "redirect:/mvc/index02.jsp";
	}
	
//	@RequestMapping(value="test06.do", method=RequestMethod.GET)
	@GetMapping("test06.do")
	public String test06Get() {
		System.out.println("test06 - GET 호출");
		return "redirect:/mvc/index02.jsp";
	}

//	@RequestMapping(value="test06.do", method=RequestMethod.POST)
	@PostMapping("test06.do")
	public String test06Post() {
		System.out.println("test06 - POST 호출");
		return "redirect:/mvc/index02.jsp";
	}

	/*
	 	application/json
	 	application/x-www-form-urlencoded
	 	text/plain
	 */
	// 클라이언트 호출 시 Content-Type 요청 헤더값에 따른 처리
	@RequestMapping(value="test07.do", consumes="application/json")
	public String test071() {
		System.out.println("test07 호출 - application/json");
		return "redirect:/mvc/index02.jsp";
	}
	@RequestMapping(value="test07.do", consumes="application/x-www-form-urlencoded")
	public String test072() {
		System.out.println("test07 호출 - application/x-www-form-urlencoded");
		return "redirect:/mvc/index02.jsp";
	}
	@RequestMapping("test07.do")
	public String test073() {
		System.out.println("test073 호출");
		return "redirect:/mvc/index02.jsp";
	}
}

















