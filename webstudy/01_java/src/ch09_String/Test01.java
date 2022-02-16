/**
 * 목표
 * 
 * 문자열
 * String : 매번 메로리를 만들때마다 더해주는데 
 * StringBuffer : 문자열을 주지 않아도 객체를 주지 않아도 16개의 메모리를 갖고있다 
 *                17번째가 되면  *2되어서 늘어난다
 * StringBuilder : 
 * 
 * 스트링 보다 나머지 두 개를 더 권장한다.
 * 
 * 문자열의 연산(+)이 많이 발생한다면 String을 사용하지마라.. 문제발생(메모리가 비효율적)
 * -셋다 문자열을 추가할 수 있다
 * 
 * 
 * <매개변수가 String일 때 클래스 호출> 
 * 클래스이름(변수);
 * StringBuffer , StringBuilder = 클래스이름(변수이름.toString());
 * 
 * <시간측정 API>
 * 반복문의 종료시간 - 반복문의 시작시간 : 걸린시간
 *                            밀리세컨드 천분의 일초 : 그냥 초로 보고싶으면 /1000
 * long s = System.currentTimeMillis();
 * long e = System.currentTimeMillis()
 * 값의 기준점 1970년 1월 1일 0시 0분 0초 이후의 밀리세컨드 시간을 반환   
 * 
 * 
 *     상수            메모리 변경X
 * String s = "a"
 * s += "b"
 * s += "bc"
 * 
 * ---|-----
 *  s |   a
 *    |  ab
 *    | abc
 *    
 *   새로운 메모리를 만들어서 주소값을 바꾸는 것. 비효율적
 *  
 *  JVM이 자동으로 메모리를 정리해준다. => Garbage collection
 *  메모리가 특정한 양만큼 차서 효율이 떨어질 때 알아서 수집하고 정리하고 삭제한다
 *  
 *  <문자열 추가>
 * StringBuffer, StringBuiled에 문자열 더하기
 *  변수이름.append(i)
 *  -> 변수가 갖고있는 값에 i를 더하겠다
 *  
 *  
 *  
 *  
 *    
 */

package ch09_String;

public class Test01 {
	static void test (String s) {
		
		String s1 = "hello";
		StringBuffer s2 = new StringBuffer("hello");
		StringBuilder s3 = new StringBuilder("hello");
		
		test(s1);
		//에러 스트링버퍼라서.. 
//		text(s2);
		//Buffer의 내용을 String으로 변경하는 작업
		test(s2.toString());
		test(s3.toString());
		
		
	}
	
	public static void main(String[] args) {
		
		// 10만번의 더하기 연산
		/*
		String s1 = "hello";
		StringBuffer s2 = new StringBuffer("hello");
		StringBuilder s3 = new StringBuilder("hello");
		
		//문자열 추가
		//s1 = s1 + "world"; 
		s1 += " world ";
		s2.append(" world ");
		s3.append(" world ");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		 */
		
		//십만번 추가하겠다
		
		/*
		//최악의 코딩.. 졸라 오래걸림. 메모리가 너무 사용된다
		String s1 = " ";
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s1 += i;
		}
		long e = System.currentTimeMillis();
		//초단위로 보기 더블형으로 바꿔주기..
		System.out.println((e - s) / 1000d + "초 걸림(String)"); 

//		
		
	StringBuffer s2 = new StringBuffer("");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
//			s2 += i; 스트링만 사용 가능
			//자신이 갖고있는 값에 i를 더한
			s2.append(i);
		}
		e = System.currentTimeMillis();
		
		System.out.println((e - s) / 1000d + "초 걸림(StringBuffer)"); 
		
		
		
		
		
		
		StringBuilder s3 = new StringBuilder("");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {

			s2.append(i);
		}
		e = System.currentTimeMillis();
		
		System.out.println((e - s) / 1000d + "초 걸림(StringBuilder)"); 
		
		
		
		*/
		
	}

}
