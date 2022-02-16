package kr.co.mlec.di._05multi;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {Config1.class})
public class Config {
	
	// Import 된 클래스는 Autowired, Resource 어노테이션으로 접근 사용
//	@Autowired
	@Resource
	private ISand sand;
	
	@Bean("menu")
	public Menu getMenu() {
		Menu menu = new Menu();
		menu.setSand(sand);
		return menu;
	}
}
