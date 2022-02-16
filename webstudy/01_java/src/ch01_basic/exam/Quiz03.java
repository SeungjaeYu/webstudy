package ch01_basic.exam;

public class Quiz03 {
	public static void main(String [] args) {
		/*
		  정수 100과 실수 10.13을 담는 변수 i,j 선언
		  println과 printf를 사용하여 아래와 같이 출력이 되도록 코드를 작성한다
		  
		  출력결과
		  println : 100 + 10.13 = 110.13
		  printf :  100 + 10.13 = 110.13
		 */
		
		int i =100;
		double j = 10.13;
		
		System.out.println("println 이용 : "+ i + " + " + j + " = "+ (i+j));
		System.out.printf("printf 이용 : %5d + %.2f = %.2f%n",i,j,i+j);
		
		
		
	}

}
