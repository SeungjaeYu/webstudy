package ch25_reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Exam {
	public static void main(String[] args) {
		// exam.properties의 내용을 읽어서 Board 클래스에 설정
		
		/*
		 *   번호 : 11
		 *   글쓴이 : .. 
		 *   제목 : ..
		 *   내용 : ..
		 *   조회수 : ..
		 */
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("src/ch25_reflection/exam.properties"));
			
			/*
			Class<?> clz = Board.class;
			Object target = clz.newInstance();
			Method[] mArr = clz.getDeclaredMethods();
			for (Method m : mArr) {
				// setNo
				String mName = m.getName();
				if (!mName.startsWith("set")) continue;
				// No
				mName = mName.substring("set".length());
				// no
				mName = Character.toLowerCase(mName.charAt(0)) + mName.substring(1);
				
				String pValue = prop.getProperty(mName);
				if (pValue == null) continue;
				
				switch (m.getParameterTypes()[0].getName()) {
				case "int":
					m.invoke(target, Integer.parseInt(pValue));
					break;
				default:
					m.invoke(target, pValue);
				}
			}
			Board board = (Board)target;
			*/
			Board board = (Board)WebUtil.getVoToParameter(Board.class, prop);
			System.out.println("번호 : " + board.getNo());
			System.out.println("제목 : " + board.getTitle());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("내용 : " + board.getContent());
			System.out.println("조회수 : " + board.getViewCnt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









