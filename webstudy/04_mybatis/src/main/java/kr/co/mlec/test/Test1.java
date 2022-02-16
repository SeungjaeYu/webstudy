package kr.co.mlec.test;

import java.util.List;

import kr.co.mlec.dao.TestMapper1;
import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

public class Test1 {
	
	private TestMapper1 mapper = new TestMapper1();
	// 데이터를 조회하기 : 하나의 로우를 반환
	private void test01() {
		/*
		//mapper를 부를것이다. mapper에 메서드를 하나 만들어준다
//		mapper.selectMemberInfo1(조회하고싶은 멤버의 아이디)
		Member m = mapper.selectMemberInfo1("member-1");
		if(m != null) {
			System.out.println("이름" + m.getName());
			System.out.println("주소" + m.getAddr());
		 */
		
		/*
		 * info2
		Member param = new Member();
		param.setId("member-3");
		param.setName("jsp");
		
		Member m = mapper.selectMemberInfo2(param);
		if(m != null) {
			System.out.println("이름" + m.getName());
			System.out.println("주소" + m.getAddr());
		*/
		
		//info3
		System.out.println("이름 : " + mapper.selectMemberInfo3("member-1"));
        //info4
		System.out.println("전체 회원 수 : " + mapper.selectMemberInfo4()+ "명");
			
		
	}
	
	// 여러개의 로우를 결과로 받기
	private void test02() { 
		//1번
//		List<Member> list = mapper.selectMemberList1();
//		for(Member member : list) {
//			System.out.println("이름" + member.getName() + ", 가입일 : " + member.getJoinDate());
//		}
		
		/* 2번
		List<String> list = mapper.selectMemberList2();
		for(String name : list) {
			System.out.println("이름" + name);
		}
		*/
		
		
		//3번
		List<Member> list = mapper.selectMemberList3();
		for(Member member : list) {
			System.out.println("이름" + member.getName() + ", 가입일 : " + member.getJoinDate());
		}
		
		
		
	}

	// 회원 등록
	private void insertMember() {
		//회원정보 만들고
		Member param = new Member();
		param.setId("member-5");
		param.setName("testㅇㅅㅇ");
		param.setEmail("asdf@gmail.com");
		param.setAddr("백범로");
		
		mapper.insertMember1(param);
		System.out.println("회원등록이 되었습니다");

		test02();
	}
	
	// 회원 수정
	private void updateMember()  {
		Member param = new Member();
		param.setId("member-5");
		param.setName("강아지똥");
		param.setEmail("oAo@gmail.com");
		param.setAddr("킬킬킬");
		
		mapper.updateMember(param);
		System.out.println("회원정보가 수정되었습니다");

		test02();
	}
	
	// 회원 삭제
	private void deleteMember() {
//		Member param = new Member();
//		param.setId("member-5");
//		mapper.deleteMember(param);
		mapper.deleteMember("member-5");
		
		System.out.println("회원정보가 삭제되었습니다");
		
		test02();
	}
	
	// 동적 쿼리 처리방식
	private void dynamicSearch() {
		/*
		//파라미터 타입이 Member
		Member param = new Member();
		param.setAddrs(new String[] {"busan", "seoul", "daejeon"});
		
		param.setAddrs2(Arrays.asList(new String[] {"busan", "seoul", "daejeon"}) );
		List<Member> list = mapper.selectMemberIteratorList(param);
		//올바르게 나오는지 확인
		for(Member member : list) {
			System.out.println("이      름 : " + member.getName() + ", " + 
			                   "지역주소 : " + member.getAddr());
		}
		*/
		/* 중복결과 확인
		System.out.printf("전체 %d명%n", mapper.selectMemberIncludeListcount());
		List<Member> list = mapper.selectMemberIncludeList();
		//올바르게 나오는지 확인
		for(Member member : list) {
			System.out.println("이      름 : " + member.getName() + ", " + 
					"지역주소 : " + member.getAddr());
		}
		*/
		
		/*
		Search param = new Search();
		//테스트하기위한 타입주기
		param.setSearchType("addr");
		param.setSearchType("name");
		param.setSearchType("id");
		param.setSearchWord("1");
		List<Member> list = mapper.selectMemberSearchList(param);
		//올바르게 나오는지 확인
		for(Member member : list) {
			System.out.println("이      름 : " + member.getName() + ", " + 
					"지역주소 : " + member.getAddr());
		}
		*/
		Member param = new Member();
//		param.setId("e");
//		param.setName("p");
		List<Member> list = mapper.selectMemberInputList(param);
		//올바르게 나오는지 확인
		for(Member member : list) {
			System.out.println("이      름 : " + member.getName() + ", " + 
					"지역주소 : " + member.getAddr());
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		try {
			Test1 t = new Test1();
		//dao -> myppconfig 설정파일 쭉 로딩 -> sql session -> testmapper1 -> 다시 메인으로 돌아온다
//			t.test01();
//			t.test02();
//			t.insertMember();
//			t.updateMember();
//			t.deleteMember();
			t.dynamicSearch();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










