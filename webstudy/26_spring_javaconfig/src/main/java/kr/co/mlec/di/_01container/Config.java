package kr.co.mlec.di._01container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	// 한번만 객체 생성하고 같은걸 사용한다.. : 내부적으로 처리한다...
	
	// attribute 'name' and its alias 'value' are declared with 
	// values of [{ham2, ham3, ham4}] and [{ham}], but only one is permitted
//	@Bean(value="ham", name={"ham2","ham3","ham4"})  // 에러 같이 사용 안됨
	@Bean(name="ham")
//	@Bean(value={"ham","ham2","ham3","ham4"})
//	@Bean(name={"ham","ham2","ham3","ham4"})
	public ISand getHamSand() {
		return new HamSand();
	}
	
	@Bean(name="egg")
	public ISand getEggSand() {
		return new EggSand();
	}
}
