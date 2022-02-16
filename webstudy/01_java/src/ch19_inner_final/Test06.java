/**
 * 내부 인터페이스
 * 
 * 무족권 static이 붙어있다 외않되
 * 
 * 
 */
package ch19_inner_final;


public class Test06 {
	public static void main(String[] args) {
		System.out.println(TopInterface.Player.Address.BASIC_ADDR);
		TopInterface.Player play = new TopInterface.Player() {
			public void play() {System.out.println("play~~");}
			public void call() {System.out.println("call~~");}
			
		};
		play.call();
		play.play();

	
	}
	

}
