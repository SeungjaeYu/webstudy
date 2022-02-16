package kr.co.mlec.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.websocket.controller.TestController")
@RequestMapping("/websocket")
public class TestController {
	
	@RequestMapping("/test01.do")
	public void test01() {}
	@RequestMapping("/test02.do")
	public void test02() {}
}
