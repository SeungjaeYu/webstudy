/**
 * 아래와 같은 결과가 되도록 코드 remove 메서드를 작성하시오
 * 
 * 실행결과>
 * hell wrld
 */
package ch09_String.exam;

public class Quiz04 {
	
	String remove(String data, char delCh) {
		String result = "";	//공백
		//    
		for (int i = 0, len = data.length(); i < len; i++) {
			char ch = data.charAt(i);
			if (ch == delCh) continue;
			
			result += ch;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Quiz04 q = new Quiz04();
		String result = q.remove("hello world", 'o');
		System.out.println(result); // hell wrld
	}
}
