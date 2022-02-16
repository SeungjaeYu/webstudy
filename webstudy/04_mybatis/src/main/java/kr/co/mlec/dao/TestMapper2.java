package kr.co.mlec.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

//마이바티스가 구현클래스를 만들게 하기
public interface TestMapper2 {
	// 반환타입과 매개변수를 지정해줘야한다
	// result id parameter
	public Member selectMemberInfo1(String id);

	public Member selectMemberInfo2(Member param);

	public String selectMemberInfo3(String id);

	public int selectMemberInfo4();

	public List<Member> selectMemberList1();

	public List<String> selectMemberList2();

	public List<Member> selectMemberList3();

	public void insertMember1(Member param);

	public void updateMember(Member param);

	public void deleteMember(String param);

	public List<Member> selectMemberIteratorList(Member param);

	public List<Member> selectMemberIncludeList();

	public int selectMemberIncludeListcount();

	public List<Member> selectMemberSearchList(Search param);

	public List<Member> selectMemberInputList(Member param);

}






