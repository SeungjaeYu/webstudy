/**
 * 
 * 인터페이스에 선언되는 모든 변수는 상수로 인식(public static final 키워드가 추가된다)
 * 
 * 인터페이스에 선언되는 메서드는 추상메서드로 적용된다(public abstract)
 * 
 * 
 */ 
package ch17_interface;

interface ServerInfo {
	String IP = "192.168.0.172";
//	public static final String IP = "192.168.0.172";
//	void info() {}  에러 interface는 보이지 않지만 public abstract가 있어서 바디가 있으면 안됨
	void info();
}

public class Test02 {
	public static void main(String[] args) {
		//static 확인
		System.out.println(ServerInfo.IP);
		
		
		//final 확인
//		ServerInfo.IP = "203.458.0.157"; 에러. final이 이미 선언되어있다
		
	}

}
