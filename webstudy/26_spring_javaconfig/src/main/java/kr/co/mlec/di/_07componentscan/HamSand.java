package kr.co.mlec.di._07componentscan;

import org.springframework.stereotype.Component;

@Component(value="ham")
public class HamSand implements ISand {
	public HamSand() {
		System.out.println("햄 샌드위치 생성자 호출");
	}
	public void info() {
		System.out.println("햄 샌드위치 입니다.");
	}
}







