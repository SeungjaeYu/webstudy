package ch06_array;

public class Test10 {
	public static void main(String[] args) {
//		int[] arr = new int[3];
//		arr[0] = 1;
//		int[] arr = {1};
		
		
		
//		int[][] arr = new int[3][];
		//생성과 동시에 값을 셋팅할 수 있다 값을 알고있을 때 사용가능
		int[] [] arr = {
				{1, 2, 3}, {4, 5}, {6}
		}; //배열 안에 배열이 있으면 다차원 중괄호 안에 중괄호가 3개 있으니까 
		System.out.println(arr[0][2]); //3이 나올꺼다
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].length);
		for(int k = 0; k < arr[i].length ; k++)
			System.out.printf("[%d] [%d] 의 값 %d %n", i, k, arr[i][k]);
		}
		
	}

}
