/**
 * 필드(멤버변수)
 * 생성자
 * 일반메서드
 * 메인메서드
 * 
 * 
 */
package ch12_constructor;

public class Member03 {
	private String name;
	private int age;
	
	
	Member03() {
		
	}
	
	Member03(String name, int age){
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
	

	

}
