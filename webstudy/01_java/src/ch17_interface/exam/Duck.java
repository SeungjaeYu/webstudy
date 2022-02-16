package ch17_interface.exam;

public class Duck implements Animal, Flyable {
	String name;
	
	public Duck() {}

	public Duck(String name) {
		this.name = name;
	}


	public void cry() {
		System.out.println("꽥꽥 웁니다");
	}
	
	public void eat() {
		System.out.println("먹습니다");
	}
	
	public void fly() {
		System.out.println("날개를 퍼덕거리지만 날지 못한다");
	}

	
	


}
