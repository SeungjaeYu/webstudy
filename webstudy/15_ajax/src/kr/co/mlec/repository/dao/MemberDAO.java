package kr.co.mlec.repository.dao;

import java.util.List;

import kr.co.mlec.repository.vo.Member;

public interface MemberDAO {
	int selectIdCount(String id);
	List<Member> selectMember();
}
