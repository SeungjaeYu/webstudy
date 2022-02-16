package ch25_reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class Test02 {
	/**
	 *  클래스 객체가 가지고 있는 메서드 확인
	 * @throws Exception
	 */
	private static void exam01() throws Exception {
		// private 가져오는 메서드, 못 가져오는 메서드
		Class<?> clz = Dog.class;
		System.out.println("Dog 클래스의 메서드 정보 출력");
		Method[] mArr = clz.getDeclaredMethods();
		for (Method m : mArr) {
			System.out.println("메서드 이름 : " + m.getName());
			Class<?> rClz = m.getReturnType();
			System.out.println("반환타입 이름 : " + rClz.getName());
			Parameter[] pArr = m.getParameters();
			for (Parameter p : pArr) {
				Type t = p.getParameterizedType();
				
				System.out.println(t.getTypeName() + " " + p.getName());
			}
			System.out.println("-----------------------------------");
		}
	}
	private static void exam02() throws Exception {
		
				Class<?> clz = Dog.class;
				System.out.println("Dog 클래스의 메서드 정보 출력");
				Method m = clz.getDeclaredMethod("setName", String.class);
				System.out.println("메서드 이름 : " + m.getName());
				Class<?> rClz = m.getReturnType();
				System.out.println("반환타입 이름 : " + rClz.getName());
				Parameter[] pArr = m.getParameters();
				for (Parameter p : pArr) {
					Type t = p.getParameterizedType();
					
					System.out.println(t.getTypeName() + " " + p.getName());
				}
				System.out.println("-----------------------------------");
				
				Method m2 = clz.getDeclaredMethod("getName");
				System.out.println("메서드 이름 : " + m2.getName());
				Class<?> rClz2 = m2.getReturnType();
				System.out.println("반환타입 이름 : " + rClz2.getName());
				Parameter[] pArr2 = m2.getParameters();
				for (Parameter p : pArr2) {
					Type t = p.getParameterizedType();
					
					System.out.println(t.getTypeName() + " " + p.getName());
				}
				System.out.println("-----------------------------------");
				
				
				
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
