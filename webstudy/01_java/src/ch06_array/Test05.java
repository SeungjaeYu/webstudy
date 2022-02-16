package ch06_array;

public class Test05 {
	public static void main(String[] args) {
		//값의 초기화 마지막 방식
//		int [] arr = new int[3] {10, 20, 30}; //하나만 쓸 수 있어서 오류
		int [] arr = new int[] {10, 20, 30}; //크기 지정을 빼라
		// 이 경우. 배열을 딱 한 번만 쓸 때 사용
		arr = new int[] {40, 50, 60}; //값의 변경을 이렇게 가능하다
		
		/*
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		*/
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
