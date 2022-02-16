package kr.co.mlec.mvc._01hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("kr.co.mlec.mvc._01hello.Test")
public class Test {
	
	@RequestMapping("/mvc/hello/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("mvc/01hello/hello");
		mav.addObject("msg", "hi 스프링 MVC~~");
		return mav;
	}
}
