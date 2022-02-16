package kr.co.mlec.security.dao;

import kr.co.mlec.security.vo.Auth;
import kr.co.mlec.security.vo.Member;

public interface MemberMapper {
	Member selectMember(String id);
	void insertMember(Member member);	
	void insertMemberAuth(Auth auth);	
}