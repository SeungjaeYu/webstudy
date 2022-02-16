package ch09_String.exam;

/*
	개요 : 다음은 주어진 문자열에서 문자를 찾는 문제입니다. 
	입력값에 따라 다음과 같은 출력이 나오도록 해당 char 의 개수를 리턴하는 checkChar 메소드를 작성하시오.
	<<처리 결과>>
	
	입력 스트링 : String strData = "Hello World Java";
	a.	ch = ’o’ 인 경우 => 2 리턴 
	b.	ch = ’W’ 인 경우 => 1 리턴 
 */
public class Quiz03 {
	
	/**
	 * 문자열에서 특정 문자를 찾아 찾은 개수를 반환하는 기능의 메소드
	 */
	
	                     //문자배열      찾는 문자
	int checkChar(String strData, char ch) {
		int count = 0;
		
		for (int i = 0; i < strData.length(); i++) {
			if (strData.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
		
		
	
	
	public static void main(String[] args) {
		Quiz03 q = new Quiz03();
		int findCnt = q.checkChar("Hello World Java", 'o');
		System.out.println("찾은 문자 개수 : " + findCnt);
	}
}