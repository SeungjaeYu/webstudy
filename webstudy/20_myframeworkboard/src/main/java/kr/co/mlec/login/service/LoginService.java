package kr.co.mlec.login.service;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.LoginDAO;
import kr.co.mlec.repository.vo.Member;

public class LoginService {
	private LoginDAO dao;
	public LoginService () {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(LoginDAO.class);
	}
	
	public Member selectLogin(Member member) {
		return dao.selectLogin(member);
	}
	
	
	
	
	
}
