package ch19_inner_final;

public class TopInterface {
	      //스태틱이 안써있지만 자동 추가되어있다
	public /* static */ interface Player {
		void play();

		void call(); // 추상메서드

		/** 인터페이스 안에 인터페이스 들어갈 수 있다 */
		interface Address {
			String BASIC_ADDR = "테스트~";

		}
	}

}
