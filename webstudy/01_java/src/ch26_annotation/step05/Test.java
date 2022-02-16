package ch26_annotation.step05;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		// MyApply의 어노테이션 정보 가져오기
		Class<?> clz = MyApply.class;
		Type1 type1 = clz.getAnnotation(Type1.class);
		Type2 type2 = clz.getAnnotation(Type2.class);
		System.out.println("type1 : " + type1);
		System.out.println("type2 : " + type2);
		System.out.println("type2.value : " + type2.value());
		Method[] mArr = clz.getDeclaredMethods();
		for (Method m : mArr) {
			System.out.println(m);
			Type3 t = m.getAnnotation(Type3.class);
			if (t == null) continue;
			System.out.println("id : " + t.id() + ", pass : " + t.pass());
		}
		
		
		/*
		Annotation[] arr = clz.getAnnotations(); // 클래스 위치에 적용된 어노테이션만 가져온다.
		for (Annotation a : arr) {
			System.out.println(a);
		}
		*/
		
	}
}
