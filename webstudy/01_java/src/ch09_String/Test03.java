/**
 * <문자열 문자배열로 변환>
 * char[] arr = 변수.toCharArray();
 * 
 * <문자열 배제>
 * 변수.split("원하는 문자열")
 * String s = "abecde";
 * String[] arr = s.split("bc") -> 통으로 인식 bc가 붙어있지 않아 abecde가 나온다
 * arr = s.split("[0~9]"); -> 숫자만 빼서 출력 [범위값]
 * arr = s.split("[bc]"); -> b,c 따로 인식. a,d,e.e출력
 * 
 * 
 * <문자열에서 문자 출력>
 * String s = "Hello java";
 *             0123456789
 *             
 * 반환타입 char(배열의 위치) 인덱스의 위치에 있는 char를 주겠다
 * if j를 문자로 반환받고 싶으면 index에 6을 넣는다
 *  	s.charAt(index);
 * char ch = s.charAt(6);
 * System.out.println(ch);
 * 
 * ---------------------------------0716
 * <문자열 대문자로 변경>
 * s.toUpperCase()
 * 
 * <문자열 소문자로 변경>
 * s.toLowerCase()
 * 
 * <문자열 변경>
 * s.replace("a", "i")
 * 붙어있는 것만 바뀐다. 뭉탱이로 인식
 * 
 * s.replaceAll("", "")
 * 스트링만 가능. regex. 
 * 
 * 
 * <양쪽 공백 제거>
 * 변수명.trim();
 * 
 * <전체 공백 제거>
 * 변수명.replace(" ", "");
 * 
 * <변수에 담기>
 * String msg = String.format(printf 포맷.. 주절주절);
 * -문자열을 반환한다
 * 
 * <다른 타입을 문자열로 변환>
 * String.valueOf(정수, 실수, 불린, 다된다);
 * 
 */



package ch09_String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		//다른 타임을 문자열로 변환하기
		//String s = 100;
		String s = 100+""; //새로운 공간을 만들어서 메모리 낭비
		
		String s2 = String.valueOf(100);
		
		
		
		
		
		
		
		
		
		
		/*
		String name = "정윤오";
		int age = 24;
		String job = "가수";
		String position = "리드보컬";
		// 류현진 선수는 나이가 31세이고 야구선수입니다. 투수로 활동하고 있습니다
		System.out.printf("%s는 나이가 %d세이고 %s입니다. %s로 활동하고 있습니다 \n", name, age, job, position);
		
		//변수에 담기
		String msg = name+ "는 나이가 " + age + "세이고 " + job + "입니다. " + position+ "로 활동하고 있습니다";
		System.out.println(msg);
		//printf 개념. 문자열을 반환한다.
		String msg2 = String.format(
				"%s는 나이가 %d세이고 %s입니다. %s로 활동하고 있습니다 ", name, age, job, position
				);
		System.out.println(msg2);
		*/
		
		
		
		
		/*
		//양쪽공백제거
		//공백을 갖고있게 만들어본다
		String s = "    Hi  java    ";
			System.out.println("|" + s.trim()+ "|");
	
			
			//모든공백 제거하기..
			System.out.println("|" + s.replace(" ", "")+ "|");	
		*/
		
		/*
		//String API 
		//문자열 내용 변경
		String s = "Hello java";
		//다 대문자로 변경
		System.out.println(s.toUpperCase());
		//소문자로 변경
		System.out.println(s.toLowerCase());
		//문자 변경
		System.out.println(s.replace("a", "i"));
		System.out.println(s.replaceAll("a", "i"));
		System.out.println(s.replace("Hello", "Bye"));
		System.out.println(s.replaceAll("Hello", "Bye"));
		*/
		
//		s = "H123442i 522j5812a755v45a";
		//숫자를 별로 변경해줘
		/*
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= '0' && ch <= '9') {
				ch = '*';
			}
			System.out.print(ch);
		}
		*/
//		System.out.print(s.replaceAll("[0-9a-zA-Z]", "*"));
		                           // 3자리가 와야한다
		//안돼
		/*
		String i = "010-5318-3712";
		System.out.print(i.replaceAll("\\d{3}-\\d{4}-\\d{4}[0-9]","*"));
		*/
		
		
		
		/*
		 String s = "Hello java";
		 //문자열의 내용을 문자 배열로 반환
		 //char로 변환
		 char[] arr = s.toCharArray();
		 System.out.println(Arrays.toString(arr));
		 
		 
		 //문자열의 내용을 바이트 배열로 변환
		 byte[] arr2 = s.getBytes();
		 System.out.println(Arrays.toString(arr2));
		
		 //권장하는 표현..
		 try {
			 
//			 arr2 = s.getBytes("abcd");
			arr2 = s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("잘못된 인코딩임..."); //abcd로 하면 나온다
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //다국어유니코드 캐릭터셋
		 
		 
		*/
		
		/*
		String s = "최욱 :매불쑈:22";
		//s의 내용을 (??) ? 로 잘라줭
		String[] arr = s.split(":");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("abcde".split(":")));
		System.out.println(Arrays.toString("abcde".split("bc"))); 
		System.out.println(Arrays.toString("abecde".split("bc"))); //bc를 통으로 봤다
	
		
		//어렵네 ㅡㅡ
		char c = 'a';
		System.out.println(c >= '0' && c<= '9' ); //c는 0-9사이의 문자
		
		s = "he12565him522her8447";
//		arr = s.split("[0~9]"); //스플릿의 대상으로 범위 지정해줬다
		s = "abcecde";
		arr = s.split("[bc]"); // b따로 c따로 빼준다
		
		
		s = "test.do?msg-hell";
		//물음표를 기준으로 나눠주기
		arr = s.split("\\?"); // \n같은 표현식.. ?을 일반으로 만들기위해 \\ !!!!!!!!!!
				
		System.out.println(Arrays.deepToString(arr));
			
		/*
		for(int i = 0; i <= s.length() ; i++) {
			char ch = s.charAt(i); //문자
			if(ch >= '0' && ch <= '9') continue; //숫자형태의 문자 무시
			System.out.println(ch);
		}*/
		
		
		
		
		
		/*
		//스트링 객체를 하나 만들었다. 메서드를 쓰려면 객체.
		String s = "Hello java";
	              //0123456789
		
		
		//반환타입 char(배열의 위치) 인덱스의 위치에 있는 char를 주겠다
		//if j를 문자로 반환받고 싶으면 index에 6을 넣는다
//	        	s.charAt(index);
		char ch = s.charAt(6);
		System.out.println(ch);
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		//  메서드(매개변수X) int를 반환. s의 문자열이 갖고있는 길이 프린트
		int len = s.length();
		System.out.println(len);
		*/
		
		
	}

}
