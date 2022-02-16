package ch06_array.exam;

public class Quiz13 {
	public static void main(String[] args) {
		String name = "제임스 고슬링";
		String[] title = {"국어", "영어", "수학"};
		int [] [] [] score = {
			{	
				{84, 55, 66},    //1학기성적
				{77, 75, 86}     //2학기성적
			},  //1학년
				{	
					{100, 98, 76},    //1학기성적
					{88, 89, 79}     //2학기성적
				}  //2학년
		};
		System.out.println();
		System.out.printf(" ** %s ** 학생의 학년 성적%n", name);
		System.out.println();
		System.out.println("--------------------");
		
		
		for (int i = 0; i < score.length; i++) { // 1학년 2학년 두번
			System.out.printf("[ %d 학년 ] %n", i + 1);

			System.out.println("--------------------");
			for (int j = 0; j < score[i].length; j++) { // 1학기 2학기 두 번 돌려라
				System.out.printf("%d학기 : %n", j + 1); // 0+1 1+1

				int sum = 0;
				for (int k = 0; k < score[i][j].length; k++) {
					System.out.printf("%s(%d)", title[k], score[i][j][k]); // 0+1 1+1
					sum += score[i][j][k];
				}

				System.out.printf("총점(%d) 평균(%.2f) %n", sum, sum / (double) score[i][j].length);
			}
		}
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
		
		
	}

}
