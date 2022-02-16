package kr.co.mlec.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
	public static void main(String[] args) {
		try {
			/*
			AbstractApplicationContext container = new GenericXmlApplicationContext(
					"config/aop/05annotation/test.xml"
			);
			*/
			GenericApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
			// Proxy 클래스가 핵심기능 클래스를 상속받게 하려면 
			// <aop:config proxy-target-class="true"> 설정해야 한다.
//			Controller controller = container.getBean("board", BoardController.class);
			
			Controller controller = container.getBean("board", Controller.class);
			controller.service();
			
			/*
			controller = container.getBean("member", Controller.class);
			controller.service();
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






