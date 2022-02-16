/**
	로또번호 생성하기
	
	조건
	1. 랜덤한 숫자(1 - 45)를 6개 생성하여 배열에 입력
	2. 배열에 중복된 숫자가 입력되지 않도록 체크
	
	출력 형식 >
	[7, 29, 12, 43, 38, 1]
 */
package ch06_array.exam;

import java.util.Random;

public class Quiz09 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Random r = new Random();

		int i;
		arr[0] = r.nextInt(45) + 1; // 처음 넣는거라
		
        //중복없애기
		outer:
			for (i = 1; i < arr.length; i++) {
			int num = r.nextInt(45) + 1;

			// i 앞의 배열 요소가 생성된 num과 같은 값이 있는지 확인해야한다

			for (int k = 0; k < i; k++) {
				if (arr[k] == num) {
					i--;
					continue outer;
				}

			}
			arr[i] = num;
		}

		System.out.print("[");
		for (i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] - 1 + ", ");
		}
		System.out.print(arr[i] - 1 + "]");

	}
}

	