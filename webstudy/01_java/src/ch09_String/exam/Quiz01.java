/**
 * <문자열 자르기> .substring(startIndex, endIndex);
 * -부분
 * 변수이름.substring(startIndex, endIndex);
 *                             endIndex-1자리까지 출력
 * ex) String s = "Hello java";
 *                 0123456789
 * String result = s.substring(0, 3); =>Hel 출력
 * 
 * -전체
 * String result2 = s.substring(0, s.length());
 * 
 * 
 * 
 * <문자열 번호 찾기> 
 * .indexOf("문자열");
 * String s = "Hello java";
 *      매개변수가 가르키는 index값을 달라 정수형값.
 *	   s가 갖고있는 문자중에 llo가 시작하는 값을 달라
 *	int index = s.indexOf("llo");
 *	System.out.println(index);
 *
 * <문자열 지정한 번호 이후부터 번호찾기>
 * index = s.indexOf("a", 8); ->a를 8번째자리 이후부터 찾아라
 *		System.out.println(index); //9
 *
 *
 * <문자열 포함 확인>
 * .contains(문자열);
 * true, false 값으로 출력
 * 
 * 
 * <문자열 역순 찾기>
 * .lastIndexOf("문자열")
 * 
 * 찾는 문자열이 없으면 값은 -1
 * 
 * 
 * <문자열 찾기>
 * s.startsWith("Hel"); -> 스트링 s 는 Hel 로 시작하니? true
 * s.equals("Hello JAVA") -> 대소문자 구별 가능해서 false
 * s.equalsIgnoreCase("HELLO JAVA") ->대소문자 무시해서 true
 * 
 * 
 */



package ch09_String.exam;

public class Quiz01 {
	public static void main(String[] args) {

		/*
		//문자열 추출
		String s = "Hello java";
		//문자열의 일부분을 갖고오겠습니다. endIndex-1 까지 잘라온다
		String result = s.substring(0, 3); // 0, 1, 2까지 갖고 올거다
		//맨 뒤까지 자르고 싶다
		String result2 = s.substring(2, s.length());
		System.out.println(result); //Hel
		System.out.println(result2); //Hel
		System.out.println(s);
		
		//s를 바꾸고 싶다면 대입을 해줘야한다
		s = s.substring(2, s.length());
		System.out.println(s);
		*/
		
		
		
		/*
		//문자열 찾기
		
		String s = "Hello java";
		//매개변수가 가르키는 index값을 달라 정수형값.
		//s가 갖고있는 문자중에 llo가 시작하는 값을 달라
		int index = s.indexOf("llo");
		System.out.println(index);
		
		//없으면 -1.. index가 0부터인데 없어서 음수를 줘야하는데 대부분-1...
		index = s.indexOf("aa");
		System.out.println(index); //-1
		
		//0번부터가 아니라 지정된 위치부터 찾아라
		index = s.indexOf("a", 8);
		System.out.println(index); //9
		
		//뒤에서부터 앞으로 오면서 찾아라
		index = s.lastIndexOf("a");
		System.out.println(index); //9
		
		// .contains(문자열);
		//s가 갖고있는 문자열에 () 를 갖고있으면 true, 아니면 false
		System.out.println(s.contains("Hello"));
		System.out.println(s.contains("Ayo"));
		*/
		
		
		/*
		String s = "Hello java";
//		s.startsWith("Hel"); //s가 갖고있는게 hel로 시작하니?
		System.out.println(s.startsWith("Hel")); //true
		System.out.println(s.startsWith("Hil")); //false
		System.out.println(s.equals("Hello java")); //true
		System.out.println(s.equals("Hello JAVA")); //false
		
		//대소문자 무시하고
		System.out.println(s.equalsIgnoreCase("HELLO JAVA")); //true
		*/
		
		
		
		
		/*
		Sub01 s = new Sub01();
//		System.out.println(s.startsWith("hello", "hi"));
//		System.out.println(s.startsWith("hello", "hel"));
		System.out.println(s.endsWith("hello", "hel"));
		System.out.println(s.endsWith("hello", "llo"));
		System.out.println(s.equals("hello", "hello"));
		System.out.println(s.equals("hello", "hillo"));
		*/

		
	}

}
