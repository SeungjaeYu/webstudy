package kr.co.mlec.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.repository.dao.LoginDAO;
import kr.co.mlec.repository.vo.Member;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO dao;
	
	@Override
	public Member selectLogin(Member member) {
		return dao.selectLogin(member);
	}
	
}
