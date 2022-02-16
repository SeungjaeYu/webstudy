/**
 * 문자열 메모리
 * 
 * String constant Pool 이해하기
 * 
 * Str = "a";
 * Str2 = "b";
 * Str3 = "b";
 * 
 * Str == Str2 ? 같은 주소를 가르키냐?
 * Str2 == Str3 같은 주소를 갖는다.
 * 
 * Str 4 = new String("b") 
 * Str4 == Str3 ?아니.. Str4는 new 해서 새로운 공간을 만들었다.
 * 
 * 
 * Str1 = new String("a");
 * Str2 = new String("a");
 * Str3 = "a";
 * Str4 = "a"
 * 
 * Str1.intern() str1이 갖고있는 문자열에 대한 컨스턴트 풀에 대한 주소를 갖고오겠다
 * new 는 새로운 주소
 * "" 컨스턴트 풀에 다이렉트로 주소를 받겠다
 * 
 */
package ch09_String;

public class Test02 {
	public static void main(String[] args) {
		String str1 = new String("a");
		String str2 = new String("a");
	
		if (str1 == str2) { //주소값 비교  내용비교는 str1 = str2 로 해야한다
			System.out.println("0. 같다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("1. 같다");
			
		}
		
		
		String str3 = "a";
		String str4 = "a";
		
		if(str3 == str4) {
			System.out.println("2.같다");
		}
		
		if(str3.equals(str4)) {
			System.out.println("3.같다");
		}
		
		
		if (str1 == str3) {
			System.out.println("4. 같다");
		}
		
		if (str1 == "a" ) {
			System.out.println("5. 같다"); //X
		}
		
		if(str1.intern() == str3) {
			System.out.println("6. 같다"); //O intern -> str1 data의 주소를 가르킨다
		}
		
		
		
		
		
		
		}
	
	
		
		
		
		
		
	}