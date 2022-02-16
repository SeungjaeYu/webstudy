package kr.co.mlec.db.member.service;

import java.util.List;

import kr.co.mlec.db.repository.vo.Member;

public interface MemberService {
	List<Member> retrieveMember();
	Member retrieveMemberInfo(String id);
	void registMember(Member member);
	void deleteMember(String id);
}
