package ch25_reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("src/ch25_reflection/test04.properties"));
			
			// 키가 없는 경우 null이 반환된다.
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("호출할 URI 입력(종료 : quit) : ");
				String uri = sc.nextLine();
				if ("quit".equals(uri)) break;
				
				String value = prop.getProperty(uri);
				if (value == null) {
					System.out.println("존재하지 않는 URI입니다.");
					continue;
				}
				String[] uriVal = value.split(":");
				Class<?> cls = Class.forName(uriVal[0]);
				Object target = cls.newInstance();
				Method method = cls.getDeclaredMethod(uriVal[1]);
				method.invoke(target);
				
//				System.out.println(value);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
