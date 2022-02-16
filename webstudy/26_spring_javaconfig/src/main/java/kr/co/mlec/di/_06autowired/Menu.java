package kr.co.mlec.di._06autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu {
	/*
	 *  같은 타입이 여러개인 경우
	 *  - 변수 이름으로 구분할 수 있다.
	 *  - @Qualifier 로 구분 가능
	 *  - <qualifier value="h" /> 로 지정된 값을 사용해서 구분 가능
	 */
	@Autowired
//	@Qualifier("ham")
	private ISand sand;
	
//	@Autowired
//	public Menu(ISand sand) {
//		this.sand = sand;
//	}
	
//	@Autowired
//	public void setSand(ISand sand) {
//		this.sand = sand;
//	}
	
	public void info() {
		sand.info();
	}
}
