/**
 * 
 * 아래와 같이 출력하는 프로그램 작성
 * 
 * 출력내용>
 * 
 * 알파벳 개수 : 52개
 * 
 * 
 */
package ch05_datatype.exam;

public class Quiz02 {
	public static void main(String[] args) {
		int sum1 = (int)('z'-'a')+1;
		int sum2 = (int)('Z'-'A')+1; // B - A 66 - 65 = 1 이지만 2개라서 +1해준다
		System.out.printf("알파벳 개수 : %d개", sum1+sum2);
//		System.out.println('Z'-'A'+1)*2;
		
		//알파벳 갯수
		int cnt = 0;
		for(char c = 'a'; c <= 'z'; c++) cnt++;
		
		System.out.println(cnt *2);
		
		//알파벳 a-z까지 나오기
		for(char c = 'a'; c <= 'z'; c++) 
		
		System.out.print(c);
		
		
	}

}
