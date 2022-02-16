package ch06_array;

public class Test04 {
	public static void main(String[] args) {
		//배열을 선언과 동시에 원하는 값으로 초기화
		
		int[] arr = {10, 20, 30};//{} 비어있으면 크기가 0인 배열 
		         //new int[3];
		
		//{} 로 초기화 하는 방법은 변수의 선언 시에만 가능하다
		//변수가 없으면 에러
		//arr[0] = 40; 이런 식으로 값의 변경을 해줘야한다
		
		/* 위에서 선언해서 필요X
		// index : 0, 1, 2처럼 배열의 위치값 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		*/
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		

		
		
	}

}
