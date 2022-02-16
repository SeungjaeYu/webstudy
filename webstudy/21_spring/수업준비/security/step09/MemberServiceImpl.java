package kr.co.mlec.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.mlec.security.dao.MemberMapper;
import kr.co.mlec.security.vo.Auth;
import kr.co.mlec.security.vo.Member;

@Service
public class MemberServiceImpl {

	@Autowired
	private MemberMapper mapper;

	@Autowired
	private PasswordEncoder encoder;
	
	public void join(Member member) {
		member.setPassword(encoder.encode(member.getPassword()));
		mapper.insertMember(member);
		Auth auth = new Auth();
		auth.setId(member.getId());
		auth.setAuth("ROLE_U");
		mapper.insertMemberAuth(auth);
	} 
}
