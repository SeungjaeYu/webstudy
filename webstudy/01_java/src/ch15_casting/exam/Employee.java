package ch15_casting.exam;

public class Employee {
	/**사번*/
	int empNo;
	/**사원명*/
	String name;
	
	/**이미 알고있다면 생성자를 하나 만들어서 선언해준다*/
	public Employee() {}
	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	/**사원정보 출력 메서드, 이름 사번이*/
	public String info() {
		 /**String이니까 문자열 형태*/
		return String.format("name = %s, empNo = %d", name, empNo);
	}
	
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
	
	
	
	
	

}
