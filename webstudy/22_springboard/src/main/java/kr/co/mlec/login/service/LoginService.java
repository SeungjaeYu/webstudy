package kr.co.mlec.login.service;

import kr.co.mlec.repository.vo.Member;

public interface LoginService {
	Member selectLogin(Member member);
}
