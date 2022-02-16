package ch14_extend;

public class Dog /*extends java.lang.Object*/{
	private String name;
	private int age;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age) {
		super();
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
	
	//어노테이션(Annotation) 지워도 상관없다
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	/*
	public String toString() {
		return "Dog [name = " + name + ", age = " + age + "]";
	}*/
	
	
	

}
