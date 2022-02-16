/**
 * 목표
 * 
 * 다차원배열의 메모리 이해
 * int[] 정수값을 담는 배열
 * int[][]  정수값을 담는 배열을 담는 배열
 * null 주소가 없어. 참조형에만 사용 가능하다
 * 
 * int[] a = null; 아직 주소가 없다
 * 
 */
package ch06_array;

public class Test08 {
	public static void main(String[] args) {
		/*
		String s = new String();//String도 참조형 주소를 받아야하는데 스트링은 new를 쓰지 않아도 가능하다
		String s2 = "a";
		String s3 = null; //나는 아직 주소가 없다
		
//		* int[] a = 100 줄수없다. 주소값을 줘야하는데 직접X
		int[] arr1 = {1, 2};
		int[] arr2 = new int[3];
		int[] arr3 = null; 
		
		//int i = null; 기본형은 주소를 받을 수 없어서 에러
		*/
		
		
		
		
		//이차원 배열
		int[] [] arr = new int[3] []; //new int [1차원 배열의 크기] [주소값. 초기화이니까 위치값이 없으니까 null]
		System.out.println("배열의 크기 : " + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = new int[2]; //이차원 배열 0번째에 2개의 공간을 만들고싶다. int[] 니까 0이 들어간다
		arr[1] = new int[3]; 
		arr[2] = new int[1];
	
		System.out.println(arr[0].length); //배열의 길이 2가 나와야한다
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		int num = 10;
		for(int i = 0; i < arr.length ; i++) //3번반복 arr[3] 이니까용
		{
			System.out.println(arr[i].length); //2차원에 들어있는 값에 대한 길이가 나온다.
			for(int k = 0; k < arr[i].length ; k++) {
				arr[i][k] = num++;
				System.out.printf("i : %d, k %d -> %d %n", i, k, arr[i][k]);
				
			}
		}
			
		
		
		
		
		
		
	}

}
