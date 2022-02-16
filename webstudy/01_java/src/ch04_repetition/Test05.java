/**
 * 목표
 * 
 * while문을 이용한 반복
 * 
 * 형식>
 * while(조건식){
 *  참일 경우 실행할 문장들 
 * }
 * 
 * 횟수가 정해져있지 않을 때 편하다
 * for문을 횟수가 정해져있을 때 편하다
 * 
 */
package ch04_repetition;

public class Test05 {
	public static void main(String[] args) {
		
	/*
		for(int i=1; i<11; i++) {
		System.out.println(i);
	}
	
 	
 	int i = 1; //초기화가 먼저이기때문에 위에 써줘야한다
	     //조건식
	while(i < 11) {
		System.out.println(i);
		i++; 	
	}
	*/	
	
		
		
	//두 개의 차이 while 변수의 범위가 다르다
	//for는 for안에서만 while은 전체
	//Dupliecate 중복되었어요... 
	//만약 다시 사용하고 싶으면 i값을 초기화 시켜준다
    int i = 1;
	while(i < 11) {
		System.out.println(i);
		i++;
	}
	i=1;
	 while(i<11) {
		 System.out.println(i);
		 i++;
	 }
	
	
		
	}

}
