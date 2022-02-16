package kr.co.mlec.di._07componentscan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Menu {
//	@Autowired
	@Resource(name="ham")
	private ISand sand;
	public void info() {
		sand.info();
	}
}