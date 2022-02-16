package kr.co.mlec.di._02constructor;

public class Menu {
	private String desc;
	public Menu() {
		System.out.println("Menu() 생성자 호출");
	}
	public Menu(String desc) {
		this.desc = desc;
		System.out.println("Menu(desc) 생성자 호출");
	}
	ISand sand;
	public Menu(ISand sand) {
		this.sand = sand;
		System.out.println("Menu(sand) 생성자 호출");
	}
	public void info() {
		System.out.println("desc : " + desc);
		if (sand != null) {
			sand.info();
		}
	}
}










