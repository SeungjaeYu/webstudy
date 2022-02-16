package ch25_reflection;

import java.lang.reflect.Method;

public class Test03 {
	/**
	 * 객체 생성하기
	 * @throws Exception
	 */
	private static void exam01() throws Exception {
		Class<?> clz = Dog.class;
		// Dog d = new Dog();
		Object obj = clz.newInstance();	// 1.8 버전 이후부터는 Duplicated
//		Object obj = clz.getDeclaredConstructor().newInstance();
		
		Dog d = (Dog) obj;
		d.setName("쫑");
		System.out.println(d.getName());
	}
	/**
	 * 메서드 실행하기
	 * @throws Exception
	 */
	private static void exam02() throws Exception {
		/*
		 * 	Dog d = new Dog();
		 *  d.setName("쫑");
		 *  String name = d.getName();
		 *  System.out.println(name);
		 */
		
		Class<?> clz = Dog.class;
		Object target = clz.newInstance();
		Method method = clz.getDeclaredMethod("setName", String.class);
		method.invoke(target, "쫑");
		
		method = clz.getDeclaredMethod("getName");
		String name = (String)method.invoke(target);
		System.out.println(name);
		
		
		
		
	}
	
	public static void main(String[] args) {
		try {
//			exam01();
			exam02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	

	
}
