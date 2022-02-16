package ch12_constructor;

public class Member04 {
	//메서드 호출
	//생성자 호출은 생성자 내에서만 사용가능하다
	//생성자 호출 코드는 생성자 내에서 가장 위쪽에 위치해야한다.
	Member04(){
		//생성자 안에서 또다른 생성자 부르기
		this("이름이 등록되지 않았음", -1);
	}

//	Member04(){
//		this.name = "이름이 등록되지 않았습니다";
//		this.age = -1;
//	}
	
	
	Member04(String name){
		this(name, -1);
	
//		this.name = name;
//		this.age = -1;
		
	}
	
	Member04(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;
	
	

}
