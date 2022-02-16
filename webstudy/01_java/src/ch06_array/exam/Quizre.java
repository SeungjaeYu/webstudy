package ch06_array.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quizre {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = r.nextInt(10)+1;
			
		}
		System.out.println("변경전 배열 :" + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length / 2 ; i++) {
			int temp = 0;
			int loc = arr.length -i -1;
			
			temp = arr[i];
			arr[i] = arr[loc];
			arr[loc] = temp;

		}
		System.out.print("변경후 배열 :" + Arrays.toString(arr));
		
		
		

		 
	}

}
