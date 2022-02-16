package ch25_reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Exam2 {
	public static void main(String[] args) throws Exception {
		// exam.properties의 내용을 읽어서 Board 클래스에 설정
		
		/*
		 * 
		 *  번호 : 11
		 *  글쓴이 : 
		 *  제목 :
		 *  내용 :
		 *  조회수 :
		 */
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/ch25_reflection/exam.properties"));
		Class<?> clz = Board.class;
		Object target = clz.newInstance();
		
//		Set<Object> set = prop.keySet();
		Method[] mArr = clz.getDeclaredMethods();
		Method method;
		for (String key : prop.stringPropertyNames()) {
			for (Method m : mArr) {

				if (m.getName().toUpperCase().contains(key.toString().toUpperCase()) && !(m.getReturnType().toString().equals("void"))) {
					if("int".equals(m.getParameterTypes()[0].getName())) {
						m.invoke(target, Integer.parseInt(prop.getProperty(key)));
					} else {
						m.invoke(target, prop.getProperty(key));
					}
				}

			}
		}
		
		
//		Method method = clz.getDeclaredMethod("setNo", Integer.class);
//		method = clz.getDeclaredMethod("setViewCnt", Integer.class);
//		method.invoke(target, prop.getProperty("viewCnt"));
//		method = clz.getDeclaredMethod("setTitle", String.class);
//		method.invoke(target, prop.getProperty("title"));
//		method = clz.getDeclaredMethod("setContent", String.class);
//		method.invoke(target, prop.getProperty("content"));
//		method = clz.getDeclaredMethod("setWriter", String.class);
//		method.invoke(target, prop.getProperty("writer"));
		
//		Method[] m = clz.getDeclaredMethods();
//		for (Method mm : m) {
//			mm
//		}
		
		method = clz.getDeclaredMethod("getNo");
		System.out.println("번호 : " + method.invoke(target));
		method = clz.getDeclaredMethod("getWriter");
		System.out.println("글쓴이 : " + method.invoke(target));
		method = clz.getDeclaredMethod("getTitle");
		System.out.println("제목 : " + method.invoke(target));
		method = clz.getDeclaredMethod("getContent");
		System.out.println("내용 : " + method.invoke(target));
		method = clz.getDeclaredMethod("getViewCnt");
		System.out.println("조회수 : " + method.invoke(target));
		
//		String name = (String)method.invoke(target);
//		System.out.println(name);
		
		
	}
}
