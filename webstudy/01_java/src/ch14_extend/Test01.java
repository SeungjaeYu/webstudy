package ch14_extend;

public class Test01 {
	public static void main(String[] args) {
		/**Employee01불러오기*/
		Employee01 e1 = new Employee01();
		/**사원번호1*/
		e1.setEmpNo(1);
		/**이름 아놀드*/
		e1.setName("아놀드");
		
		 
		Employee01 e2 = new Employee01(2, "실버스타");
		
		
		Manager01 m = new Manager01(3, "다우니");
		/**관리자한테 사원을 관리하라는 메서드*/
		m.addEmployee(e1);
		m.addEmployee(e2);
		/**관리하는 사원 출력*/
		System.out.println(m.info());
		
		
		
		
		
		/* 사원정보 확인
		System.out.println(e1.info());
		System.out.println(e2.info());
		*/
		
		
		
		
		
		
	}
	
	

}
