package ch13_static.exam;

public class Sub01 {
	
	
	private Sub01() {}
	public void msg() {
		System.out.println("성공");
	}
	
//	static Sub01 s = new Sub01();
	
	/*
	private static Sub01 s = new Sub01();
	public static Sub01 getInstance() {
		return s;
		*/
	
    //객체를 하나만 생성해서 관리하자 : Singleton Pattern	
	private static Sub01 s = new Sub01();
	public static Sub01 getInstance() {
		if(s == null) {
			s = new Sub01();
		}
		return s;
		
		
		
		
		
		
		
	}
	
}

/*
 위쪽의 코드는 변경하지 않는다.
 아래에 코드를 추가하여 Quiz01 클래스에서 Sub01 클래스의
 객체 변수를 얻을 수 있게 작성
 
 단, 생성자는 더이상 추가하면 안된다.
*/