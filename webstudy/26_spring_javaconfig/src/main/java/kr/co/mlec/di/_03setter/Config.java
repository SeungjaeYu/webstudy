package kr.co.mlec.di._03setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="menu1")
	public Menu getMenu1() {
		Menu menu = new Menu();
		return menu;
	}
	
	@Bean(name="menu2")
	public Menu getMenu2() {
		Menu menu = new Menu();
		menu.setDesc("샌드위치 : 햄, 음료 : 콜라");
		return menu;
	}
	
	@Bean
	public ISand getSand() {
		return new HamSand();
	}
	
	@Bean(name="menu3")
	public Menu getMenu3() {
		Menu menu = new Menu();
		menu.setSand(getSand());
		return menu;
	}
	
}
