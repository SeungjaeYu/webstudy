package ch17_interface.exam;

public class Dog implements Animal {
	String name;

	public Dog(String name) {
		this.name = name;
	}

	public void cry() {
		System.out.println("멍멍 짖습니다");
	}
	public void eat() {
		System.out.println("먹습니다");
	}
	


}
