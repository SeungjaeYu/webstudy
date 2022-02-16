package kr.co.mlec.aop._04schema;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		try {
			AbstractApplicationContext container = new GenericXmlApplicationContext("config/aop/04schema/test.xml");
			
			// Proxy 클래스가 핵심기능 클래스를 상속받게 하려면
			// <aop:config proxy-target-class="true"> 설정해야 한다.
//			Controller controller = container.getBean("board", BoardController.class);
//			controller.service();
			Controller controller = container.getBean("board", Controller.class);
			controller.service();
			controller = container.getBean("member", Controller.class);
			
			controller.service();
			
			
			container.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
