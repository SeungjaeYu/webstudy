package ch12_constructor.exam;

public class Dog {
	private String name;
	private int age;
	
	Dog(){
		this("모름", 0);
		
	}
	
	Dog(String name){
		this(name, 0);
		
	}

	Dog(int age){
		this("모름", age);
	
	}
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	

	
	
	void info() {

		System.out.println("강아지의 이름은 " + name + "이고 나이는 " + age + "입니다");
	
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

}
