package ch14_extend;

//자식클래스
public class Manager02 extends Employee02{
	
	Employee02ArrayList02 mngList = new Employee02ArrayList02();
	
	public Manager02() {
		/*
		//내꺼먼저 찾는다
		System.out.println(name);
		//부모꺼
		System.out.println(super.name);
		*/
	}
	public Manager02(int empNo, String name) {
//		this(empNo, name); 오류 .. 재귀적호출 매니저에도 empNo와 name이 있기때문에 매니저를 한 번 또 부른거다 반복 
		//자기자신 지칭 : this
		//부모의 지칭 : super.변수
		            
//		this.empNo = empNo;
//		this.name = name;
		super(empNo, name);
		
	}
	
	
	
	

	
	/**관리자한테 관리사원*/
	public void addEmployee(Employee02 e) {
		mngList.add(e);
		
	}
	
	
	
	/**관리자 정보넘겨줄 메서드*/
	/**관리하는 사원들 정보도 같이 넘겨주기*/
	public String info() {
		
		StringBuilder msg = new StringBuilder(
//				info() 재귀
				//부모에 있는 info 호출
				super.info()
//				String.format("name = %s, empNo = %d \n", name, empNo)
				);
				


		
		
		msg.append("관리하는 사원의 정보 \n");

		msg.append("-------------------- \n");

		
		
		
		for(int i = 0; i < mngList.size(); i++) {
			Employee02 e = mngList.get(i);
			msg.append(e.info() + "\n");

		}
		
		
		msg.append("-------------------- \n");

		return msg.toString(); //빌더 -> 문자열로 넘겨주기
		
		
	}
	
	
	
	

}
