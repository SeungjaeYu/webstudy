package kr.co.mlec.di._05multi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {
	@Bean(name="ham")
	public ISand getHamSand() {
		return new HamSand();
	}
}
