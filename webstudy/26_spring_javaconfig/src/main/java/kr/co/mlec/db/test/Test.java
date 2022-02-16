package kr.co.mlec.db.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import kr.co.mlec.db.member.controller.MemberController;

public class Test {
	public static void main(String[] args) {
		try {
			/*
			AbstractApplicationContext container = 
					new GenericXmlApplicationContext(
					"config/db/spring/context-repository.xml"		
			);
			*/
			GenericApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
			
			MemberController controller = container.getBean(MemberController.class);
//			controller.deleteMember("member-4");
//			controller.registMember();
			controller.retrieveMember();
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}







