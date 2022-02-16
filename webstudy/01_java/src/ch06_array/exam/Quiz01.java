/**
 * 
 * 정수 10개를 담을 수 있는 배열을 array 선언
 * 생성된 배열을 반복하면서 배열의 각 요소에 인덱스 * 2 + 2의 값을 대입하시오
 * 예 > 0번 요소 : 2(0 * 2 + 2), 1번 요소 : 4(1 * 2 + 2)
 * 
 * 1. 정수값 10개
 * 2. 반복 요소 대입
 * 3. 화면 출력
 * 
 */
package ch06_array.exam;

public class Quiz01 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		System.out.println("Index    Value");
		for(int i = 0; i < array.length; i++ ) {
			array[i] = 2 * i + 2;
			
			System.out.printf("%s%8s\n", "Index", "Value");
			for(int i1 = 0; i1 < array.length; i1++)
				System.out.printf("%5d%8d\n",i1, array[i1]);
				
		}
		
		
		
		
	}

}
