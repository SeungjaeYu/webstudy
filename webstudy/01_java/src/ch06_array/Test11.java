/**
 * 목표
 * 
 * 2차원 배열 연습
 * 
 * 고슬링 학생의 한학년의 성적 관리 ...
 * 
 */
package ch06_array;

public class Test11 {
	public static void main(String[] args) {
		/*
		 *  **고슬링** 학생의 학년 성적
		 *  
		 *  -------------------
		 *  1학기 : 국어(84) 영어(55) 수학(66)  //1학기성적이라는 공통점이 있다
		 *  2학기 : 국어(77) 영어(75) 수학(86) //2학기 성적이라는 공통점이 있다  
		 *  -------------------
		 *  
		 */
		String name = "제임스 고슬링";
		String[] title = {"국어", "영어", "수학"};
		
		int [] [] score = {
				{84, 55, 66},    //1학기성적
				{77, 75, 86}     //2학기성적
		};
		
		System.out.printf(" ** %s ** 학생의 학년 성적%n", name);
		System.out.println();
		System.out.println("--------------------");
		for(int i = 0; i < score.length; i++) { //1학기 2학기 두 번 돌려라
			System.out.printf("%d학기 : ", i + 1); //0+1 1+1
			for(int k = 0; k < score[i].length; k++) {
			System.out.printf("%s(%d) ", title[k], score[i][k]); //0+1 1+1
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		
		
	}

}
