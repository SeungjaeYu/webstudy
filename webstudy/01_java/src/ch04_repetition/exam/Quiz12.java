/**

구구단을 아애와 같이 출력하는 프로그램을 작성하시오


출력형식>

 :   1   2   3   4   5   6   7   8   9
------------------------------------------
2단    2   4   6   8  10  12  14  16  18
3단    3   6   9  12  15  18  21  24  27
4단    4   8  12  16  20  24  28  32  36
5단    5  10  15  20  25  30  35  40  45
6단    6  12  18  24  30  36  42  48  54
7단    7  14  21  28  35  42  49  56  63
8단    8  16  24  32  40  48  56  64  72
9단    9  18  27  36  45  54  63  72  81
------------------------------------------

 */
package ch04_repetition.exam;

public class Quiz12 {
	public static void main(String[] args) {
		System.out.printf(" :");
		int x,y,z;
		for(x = 1; x <10; x++)
			System.out.printf("%4d", x);
		System.out.println();
		
		for(int l = 1; l <=40; l++) {
			System.out.printf("%s","-");
		}
		System.out.println();
		
		
		
		for(y = 2 ; y <= 9; y++) {
			System.out.printf("%d단", y);
			for(z = 1; z <= 9; z++)
				System.out.printf("%4d", z*y);
			System.out.println();
		}
		
		for(int l = 1; l <=40; l++) {
			System.out.printf("%s","-");
		}
		System.out.println();
	


		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
