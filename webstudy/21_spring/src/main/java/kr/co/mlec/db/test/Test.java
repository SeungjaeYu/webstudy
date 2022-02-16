package kr.co.mlec.db.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.mlec.db.member.controller.MemberController;


public class Test {
	public static void main(String[] args) {
		try {
			AbstractApplicationContext container = new GenericXmlApplicationContext("config/db/spring/context-repository.xml");
			MemberController controller = container.getBean(MemberController.class);
//			controller.deleteMember("member-4");
//			controller.registMember();
			controller.retrieveMember();
			container.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
