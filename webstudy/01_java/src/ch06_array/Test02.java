package ch06_array;

public class Test02 {
	public static void main(String[] args) {
		//정수(int) 값을 3개 담을 수 있는 배열을 선언하고 생성(new)하라
		int[] arr = new int[3];
		
		//생성된 배열의 크기 화면에 출력
		System.out.println("배열의 크기 : " + arr.length);
		
		//공간에 값 대입하고 꺼내쓰기 
		//변수랑 비슷하게 생각해라 int a 같이 arr[알고 싶은 방의 번호]
		
		/*
		 * 배열은 생성과 동시에 자동 초기화가 발생한다
		 * 정수 : 0
		 * 실수 : 0.0
		 * 논리 : false
		 * 문자 \u0000 공백문자
		 */
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// =>반복문이 떠오른다. 0,1,2만 바뀐다. 0-2 세번 돈다
		
		//반복문으로 바꿔보자
		//for(int i = 0; i < 3 ; i++) System.out.println("배열" + arr[i]);
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("배열" + arr[i]); //변경되면 바로 수정이 편하다
		}
		
		
		//double 배열
		double[] arr2 = new double[3];
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println("arr2 : " + arr2[i]); //변경되면 바로 수정이 편하다
		}
		
		
		//arr3 이름의 논리형을 3개 담는 배열
		boolean[] arr3 = new boolean[3];
		for(int i = 0; i < arr3.length ; i++) {
			System.out.println("arr3 : " + arr3[i]); 
		}
		
		
		//arr4 문자를 3개 담는 배열
		char[] arr4 = new char[3];
		for(int i = 0; i < arr4.length ; i++) {
			System.out.println("|"+ arr4[i] + "|"); 
		}
		
		
		
		
	}

}
