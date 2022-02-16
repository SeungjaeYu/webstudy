package ch26_annotation.step06;

import java.lang.reflect.Method;
import java.util.Scanner;


public class Test1 {
	public static void main(String[] args) {
		try {
			Class<?> cls = BoardController.class;
			Object target = cls.newInstance();
			
			Method[] mArr = cls.getDeclaredMethods();
			// 키가 없는 경우 null이 반환된다.
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				boolean flag = false;
				System.out.print("호출할 URI 입력(종료 : quit) : ");
				String uri = sc.nextLine();
				if ("quit".equals(uri)) break;
				for (Method m : mArr) {
					RequestMapping prop = m.getAnnotation(RequestMapping.class);
					String value = prop.value();
					
					if (value.equals(uri)) {
						m.invoke(target);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("존재하지 않는 URI입니다.");
				}
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
