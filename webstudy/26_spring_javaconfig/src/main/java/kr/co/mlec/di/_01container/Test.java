package kr.co.mlec.di._01container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				// 컨테이터가 초기화시 필요한 정보를 담고있는 XML 위치
				"config/di/04container/test.xml"
		);
		*/
		GenericApplicationContext container = new AnnotationConfigApplicationContext(Config.class); 		
		System.out.println("컨테이너 로딩 끝났음...");
		
//		ISand sand = (ISand)container.getBean("ham");
//		ISand sand = container.getBean("ham", ISand.class);
		// ISand 타입이 여러개일 경우에는 에러가 발생한다.
//		ISand sand = container.getBean(ISand.class);
//		ISand sand = container.getBean(HamSand.class);
//		ISand sand = (ISand)container.getBean("ham2");
		ISand sand = (ISand)container.getBean("egg");
		sand.info();
	}
}










