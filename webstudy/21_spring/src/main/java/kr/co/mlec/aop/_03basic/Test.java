package kr.co.mlec.aop._03basic;

import kr.co.mlec.aop._03basic.BoardController;
import kr.co.mlec.aop._03basic.Controller;
import kr.co.mlec.aop._03basic.MemberController;

public class Test {
	public static void main(String[] args) {
		Controller controller = new ProxyController(new BoardController());
		controller.service();
		controller = new ProxyController(new MemberController());
		controller.service();
	}
}
