package kr.co.mlec.di._07componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				"config/di/11componentscan/test.xml"
		);
		*/
		GenericApplicationContext container = new AnnotationConfigApplicationContext(Config.class); 
		Menu menu = container.getBean("menu", Menu.class);
		menu.info();
	}
}









