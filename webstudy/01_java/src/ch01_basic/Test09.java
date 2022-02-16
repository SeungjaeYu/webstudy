/**
 * 목표
 * 
 * printf에 대해 상세하게 이해하자
 * 
 */
package ch01_basic;

public class Test09 {
	public static void main(String [] args) {
		int val = 22;
		System.out.printf("|%d|%n",val);
		                  //|   22|   
		System.out.printf("|%5d|%n",val); //%5를 찍을 때 5칸을 확보하겠다 ㅁㅁㅁ22 다섯칸
		                  //|22   |
		System.out.printf("|%-5d|%n",val);//5자리를 출력하는데 앞에서부터 출력하겠다 22ㅁㅁㅁ
		                  //|00022|
		System.out.printf("|%05d|%n",val);//비어있는 칸에 0으로 채워지게된다
		
		                 //|22.100000|
		double val2 = 22.1;
		System.out.printf("|%f|%n",val2);
		
		
		//소수점 아래 출력 .숫자
		System.out.printf("|%.2f|%n",val2);//소수점 아래 두 자리만 출력
		                //| 22.10| 공백이 한 칸이 생긴다. 5자리에서 6자리로 만들어줘서
		System.out.printf("|%6.2f|%n",val2); //6.2  6 은 최소 자리수. 쩜2는 뒤에 소수점자리. 자리수가 넘어가면 그냥 출력한다. 소수점은 준 값대로 나온다
//		System.out.printf("|%10d|%10d|%n",1212); 오류.10d 10d는 두 개인데 뒤에 args 값이 하나밖에 없어서
		System.out.printf("|%1$10d|%1$10d|%n",1212); //1$는 첫번째 args위치에 있는 값을 사용합니다
		                                             //위치$. $는 같은 값을 여러번 쓰고 싶어서 or 순서를 내맘대로 하기 위해서
		
		
		
	}

}
