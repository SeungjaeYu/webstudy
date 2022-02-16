package kr.co.mlec.di._03setter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				// 컨테이터가 초기화시 필요한 정보를 담고있는 XML 위치
//				"config/di/06setter/test.xml"
				"config/di/06setter/test2.xml"				
		);
		*/
		GenericApplicationContext container = new AnnotationConfigApplicationContext(Config.class); 
		
		Menu menu1 = container.getBean("menu1", Menu.class);
		menu1.info();
		Menu menu2 = container.getBean("menu2", Menu.class);
		menu2.info();
		Menu menu3 = container.getBean("menu3", Menu.class);
		menu3.info();
	}
}


















