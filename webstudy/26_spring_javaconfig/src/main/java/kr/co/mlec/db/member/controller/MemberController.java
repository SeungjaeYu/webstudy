package kr.co.mlec.db.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.mlec.db.member.service.MemberService;
import kr.co.mlec.db.repository.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;

	public void registMember() {
		Member m = new Member();
		m.setId("member6");
		m.setName("멤버6");
		m.setEmail("m@m.com");
		m.setAddr("멤버아파트");
		service.registMember(m);
	}
	
	public void deleteMember(String id) {
		service.deleteMember(id);
		System.out.println(id + " 회원이 삭제되었음..");
	}
	
	public void retrieveMember() {
		List<Member> list = service.retrieveMember();
		System.out.println("회원정보");
		System.out.println("-------------------------");
		for (Member m : list) {
			System.out.println("아이디 : " + m.getId());
			System.out.println("이름 : " + m.getName());
		}
		System.out.println("-------------------------");
	}
}












