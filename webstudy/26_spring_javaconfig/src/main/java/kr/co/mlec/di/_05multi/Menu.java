package kr.co.mlec.di._05multi;

public class Menu {
	private ISand sand;
	public void setSand(ISand sand) {
		this.sand = sand;
	}
	public void info() {
		sand.info();
	}
}
