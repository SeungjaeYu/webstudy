package ch08_method;

public class Singer {
	//변수의 직접 접근을 허용하지 않는다. 변수에 장난치면 안돼ㅡㅡ
	//public 접근제한자 접근에 대한 범위 지정 static 활용제한자. 	
	//메서드를 통해 접근한다.
	//세터 메서드와 게터 메서드를 만들어야한다
	private String name;
	private int age;
	
	//세터 메서드를 만든다
	/*
	 * Setter 메서드
	 * - 값을 설정 not 주는 것
	 * void(return이 없다)
	 * 매개변수 설정하려는 타입과 같은 것을 준다
	 * 
	 * 
	 * 접근제한자 (열어주는 것) : 멤버변수를 막았으니
	 *                   public 모두 다 쓸 수 있어 공용
	 * 
	 * 
	 * 반환타입 : void
	 * 이름 : set(세터메서드)필드명(이름을 줄거면 setName)
	 * 매개변수 : 설정할 필드와 같은 타입 String 이면 String
	 */
	public void setName(String name) {
		//this.name 은 필드변수에 있는 name이다
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age < 1) { //잘못된 정보를 입력하는 것을 방지할 수 있다
			System.out.println("장난치지말아라ㅡㅡ");
			return;
		}
		this.age = age;
	}
	
	
	//값을 넘겨주는 getter method를 만들어보자
	/**
	 *접근제한자 : public 
	 *이름 : get필드명(getName)
	 *
	 *반환타입 :넘겨주려는 필드의 데이터타입 String = String / int = int
	 *
	 *매개변수 : X 없다
	 * 
	 */
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
	
	
}
