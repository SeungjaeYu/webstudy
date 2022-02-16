/**
 * 
 * 로또 섞지않고 하나값만 존재하게
 * 0-44 까지의 자리에서 숫자를 뽑는다
 * 뽑힌 숫자 자리에 맨 끝에 숫자를 집어넣었다.
 * 끝 칸은 한 칸 줄어든다
 * 
 */
package ch06_array.exam;
import java.util.Random;
public class Quiz11 {
	public static void main(String[] args) {
		final int MAX_NUMBER = 45;
		int [] numbers = new int[MAX_NUMBER];
		for(int i = 0; i < MAX_NUMBER ; i++){
			numbers[i] = i + 1; //0 + 1 
		}
		
		Random r = new Random();
		for(int i = 0; i < 6 ; i++) { //숫자 6개를 뽑을 차례
			int index = r.nextInt(MAX_NUMBER - i); // 범위 : 랜덤으로 0~ 44 배열에서 수를 뽑고 줄어든다..
			System.out.println(numbers[index]); 
			
			numbers[index] = numbers[MAX_NUMBER - 1 - i]; //  
		}
		
		
		
		
		
		
		
		
	}

}
