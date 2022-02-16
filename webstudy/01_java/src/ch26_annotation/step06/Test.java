package ch26_annotation.step06;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			Map<String, Method> mapping = new HashMap<>();

			Class<?> clz = BoardController.class;
			Object obj = clz.newInstance();
			Method[] arr = clz.getDeclaredMethods();
			for (Method m : arr) {
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				if (rm == null) continue;
				
				String val = rm.value();
				mapping.put(val, m);
			}
			
			while (true) {
				System.out.print("호출할 URI 입력(종료 : quit) : ");
				String uri = sc.nextLine();
				if ("quit".equals(uri)) break;
					
				Method m = mapping.get(uri);
				if (m == null) {
					System.out.println("존재하는 않는 URI입니다.");
					continue;
				}
				m.invoke(obj);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}









