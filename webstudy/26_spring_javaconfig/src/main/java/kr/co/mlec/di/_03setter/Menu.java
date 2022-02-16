package kr.co.mlec.di._03setter;

public class Menu {
	private String desc;
	public Menu() {
		System.out.println("Menu() 생성자 호출");
	}
	public void setDesc(String desc) {
		this.desc = desc;
		System.out.println("setDesc(desc) 메서드 호출");
	}
	ISand sand;
	public void setSand(ISand sand) {
		this.sand = sand;
		System.out.println("setSand 메서드 호출");
	}
	public void info() {
		System.out.println("desc : " + desc);
		if (sand != null) {
			sand.info();
		}
	}
}










