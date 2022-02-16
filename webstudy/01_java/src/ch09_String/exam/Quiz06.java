/**
	실행 결과가 아래와 같이 되도록 getNextId 메서드 작성
	
	실행결과>
	USER00008
	ORDER00010
	PRODUCT00004
 */
package ch09_String.exam;

import java.util.Arrays;

public class Quiz06 {
	public static void main(String[] args) {
		Quiz06 q = new Quiz06();
		System.out.println(q.getNextId("USER-00007"));
		System.out.println(q.getNextId("ORDER-00009"));
		System.out.println(q.getNextId("PRODUCT-00003"));
		
	
	}

	String getNextId(String id) {
		
		String[] arr = id.split("-");
		int i = Integer.parseInt(arr[1]);
		i++;
		System.out.printf("%05d", i);
		
		//위 스트링 변수를 하나 만들고 반복문을 돌려서 값을 더해봐라... 
		
		
//		System.out.println(i);
				

		
		return "";
	}
}
