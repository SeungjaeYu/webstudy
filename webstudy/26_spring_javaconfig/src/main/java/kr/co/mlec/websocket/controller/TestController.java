package kr.co.mlec.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.websocket.controller.TestController")
@RequestMapping("/websocket")
public class TestController {
	
	@GetMapping("/test01.do")
	public void test01() {}
	
	@GetMapping("/test02.do")
	public void test02() {}
}











