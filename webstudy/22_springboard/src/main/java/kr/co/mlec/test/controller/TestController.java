package kr.co.mlec.test.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mlec.repository.vo.Test;

@Controller("kr.co.mlec.test.controller.TestController")
public class TestController {
	// webapp/jsp/test/test.jsp
	@RequestMapping("/test/test.do")
	public void testForm() { }
	
	@RequestMapping("/test/process.do")
	public String testProcess(Test test) {
		System.out.println(test.getMsg());
		System.out.println(test.getBbb());
		System.out.println(Arrays.toString(test.getAaa()));
		return "test/test";
	}
}
