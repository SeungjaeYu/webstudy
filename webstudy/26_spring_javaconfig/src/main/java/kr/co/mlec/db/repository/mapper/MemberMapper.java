package kr.co.mlec.db.repository.mapper;

import java.util.List;

import kr.co.mlec.db.repository.vo.Member;

public interface MemberMapper {
	Member selectMemberById(String id);
	List<Member> selectMember();
	void insertMember(Member member);
	void updateMember(Member member);
	void deleteMember(String id);
}














