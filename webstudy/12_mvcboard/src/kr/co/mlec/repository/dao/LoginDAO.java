/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package kr.co.mlec.repository.dao;

import kr.co.mlec.repository.vo.Member;

public interface LoginDAO {
	Member selectLogin(Member member);
}












