package kr.co.mlec.repository.dao;

import kr.co.mlec.repository.vo.Member;

public interface LoginDAO {
	Member selectLogin(Member member);
}
