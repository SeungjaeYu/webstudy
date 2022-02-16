/**

1 부터 100사이의 숫자 중에서 소수를 출력하는 프로그램을 작성하시오.
소수는 그 수 자신과 1을 제외한 다른 정수로는 나누어 떨어지지 않는 정수 

3이 소수인지 판별 : 
   3 % 1 == 0 (참)
   3 % 2 == 0 (거짓)
   3 % 3 == 0 (참)
참인 경우가 2개인 경우 소수

 */
package ch04_repetition.exam;

public class Quiz13 {
	public static void main(String[] args) {
		int a, b;
		boolean cham = true;

//		while(true) {
		for (a = 2; a <= 100; a++) // 2부터 100까지 숫자를 구한다 소수는 2부터이다.

		{
			cham = true;
			for (b = 2; b < a; b++) {
				if (a % b == 0)
					cham = false;

			}
			if (cham)
				System.out.println(a);

		}

		// 나눴을 때 카운터가 1이상 올라가지 않는 것...
		/*
		 * if(a % 2 == 0 && a % 3 ==0 && a % 7 == 0 ) { continue; }
		 */
		// a % 1 == 0 && a % a == 0 얘네들만 출력할 수 있게...
		// System.out.printf("%4d", a);

	}
}
