package kr.co.mlec.db.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mlec.db.repository.mapper.MemberMapper;
import kr.co.mlec.db.repository.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public List<Member> retrieveMember() {
		return mapper.selectMember();
	}

	@Override
	public Member retrieveMemberInfo(String id) {
		return mapper.selectMemberById(id);
	}

	@Transactional(rollbackFor=Exception.class)
	public void registMember(Member member) {
		mapper.insertMember(member);
		mapper.updateMember(member);
	}

	@Override
	public void deleteMember(String id) {
		mapper.deleteMember(id);
	}
}




