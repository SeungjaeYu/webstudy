package kr.co.mlec.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

public class TestMapper1 {
	 //kr.co.mlec.common.db > MyAppSqlConfig 세션을 달라고 함..
     /*
      * mybatis를 사용하기위한 sqlsession 객체가 필요함
      * 	
      */
	//namespace
	private static final String NS = "kr.co.mlec.dao.TestMapper1.";
	//멤버변수
	private static SqlSession session;
	//생성자를 만든다
	public TestMapper1() {
		//객체 만들기
		session = MyAppSqlConfig.getSqlSessionInstance();
		//제대로 로딩됐는지 확인
		System.out.println(session);
		
	} 
	//반환타입과 매개변수를 지정해줘야한다	
	public Member selectMemberInfo1(String id){
//		                                   어디서 호출됐는지 모를 수 있다. namespace를 같이 붙인다
//		Member member = session.selectOne("select 태그 호출", 파라미터);
		Member member = session.selectOne(NS + "selectMemberInfo1", id);
		return member;
	}
	
	public Member selectMemberInfo2(Member param) {
		return session.selectOne(NS + "selectMemberInfo2", param);
	}
	
	public String selectMemberInfo3(String id) {
		return session.selectOne(NS + "selectMemberInfo3", id);
	}
	
	public int selectMemberInfo4() {
		return session.selectOne(NS + "selectMemberInfo4");
	}
	
	public List<Member> selectMemberList1() {
		return session.selectList(NS + "selectMemberList1");
	}
	
	public List<String> selectMemberList2() {
		return session.selectList(NS + "selectMemberList2");
	}

	public List<Member> selectMemberList3() {
		return session.selectList(NS + "selectMemberList3");	}
	
	
	public void insertMember1(Member param) {
		session.insert(NS + "insertMember1", param);
		//commit
//		session.commit();
	}
	
	public void updateMember(Member param) {
		session.update(NS + "updateMember", param);
	}
	
	public void deleteMember(String param) {
		session.update(NS + "deleteMember", param);
	}
	public List<Member> selectMemberIteratorList(Member param) {
		// TODO Auto-generated method stub
		return session.selectList(NS + "selectMemberIteratorList", param);
	}
	
	public List<Member> selectMemberIncludeList(){
		return session.selectList(NS + "selectMemberIncludeList");
	}
	public int selectMemberIncludeListcount(){
		return session.selectOne(NS + "selectMemberIncludeListcount");
	}
	
	public List<Member> selectMemberSearchList(Search param){
		return session.selectList(NS + "selectMemberSearchList", param);
		
	}
	
	public List<Member> selectMemberInputList(Member param){ 
		return session.selectList(NS + "selectMemberInputList", param);
		
	}
	
	
	
}








