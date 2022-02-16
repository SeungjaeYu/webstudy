package ch25_reflection;

public class Test01 {
	private static void test(Object o) {
		Class<?> clz = o.getClass();
		System.out.println(clz.getName());
	}
	
	
	/**
	 *  Class 객체 얻는 방법(Method Area에 접근한 객체)
	 */
	private static void exam01() throws Exception {
		// 1번 방식 : 클래스이름.class
		Class<?> clz = Dog.class;
		
		// 2번 방식 : Class.forName("패키지포함 클래스명");
		Class<?> clz2 = Class.forName("ch25_reflection.Dog");
		
		// 3번 방식 : 객체.getClass()
		Dog d = new Dog();
		Class<?> clz3 = d.getClass();
		
		System.out.println(clz == clz2);
		System.out.println(clz2 == clz3);
		
		System.out.println(clz.getSimpleName());	// 클래스 이름
		System.out.println(clz.getName());	// 패키지를 포함한 클래스 이름
	}
	public static void main(String[] args) {
		try {
			exam01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
