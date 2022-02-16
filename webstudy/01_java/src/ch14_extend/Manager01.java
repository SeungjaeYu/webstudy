package ch14_extend;

public class Manager01 {
	
	//매니저의 이름과 사번
	int empNo;
	String name;
	//관리하는 사원들 정보 담을 변수필요.. 여러명이 있어서. 배열 관리해주는 것이 있어야 한다.
	Employee01ArrayList mngList = new Employee01ArrayList();
	
	public Manager01() {}
	public Manager01(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	
	/**매니저에 아무것도 없다면.. */
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**관리자한테 관리사원*/
	public void addEmployee(Employee01 e) {
		mngList.add(e);
		
	}
	
	
	
	/**관리자 정보넘겨줄 메서드*/
	/**관리하는 사원들 정보도 같이 넘겨주기*/
	public String info() {
		
		StringBuilder msg = new StringBuilder(
				String.format("name = %s, empNo = %d \n", name, empNo)
				);
//		String msg = String.format("name = %s, empNo = %d \n", name, empNo);

		
		
		msg.append("관리하는 사원의 정보 \n");
//		msg += ;
		msg.append("-------------------- \n");
//		msg += "-------------------- \n";
	
		
		
		
		for(int i = 0; i < mngList.size(); i++) {
			Employee01 e = mngList.get(i);
			msg.append(e.info() + "\n");
//			msg += e.info() + "\n";
		}
		
		
		msg.append("-------------------- \n");
//		msg += "-------------------- \n";
		return msg.toString(); //빌더 -> 문자열로 넘겨주기
		
		/* 스트링 버퍼나 스트링 빌더로 변경
		String msg = String.format("name = %s, empNo = %d \n", name, empNo);
		msg += "관리하는 사원의 정보 \n";
		msg += "-------------------- \n";
		for(int i = 0; i < mngList.size(); i++) {
			Employee01 e = mngList.get(i);
			msg += e.info() + "\n";
		}
		msg += "-------------------- \n";
		return msg;
		 */
	}
	
	
	
	

}
