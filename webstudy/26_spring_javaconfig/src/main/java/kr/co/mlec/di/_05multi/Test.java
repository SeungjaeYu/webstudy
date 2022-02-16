package kr.co.mlec.di._05multi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				new String[] {
						"config/di/08multi/test.xml",
						"config/di/08multi/test2.xml"
				}
		);
		*/
		GenericApplicationContext container = new AnnotationConfigApplicationContext(Config.class); 	
		Menu menu = container.getBean("menu", Menu.class);
		menu.info();
	}
}









