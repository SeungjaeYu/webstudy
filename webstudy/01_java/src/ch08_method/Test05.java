package ch08_method;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * 레드벨벳 22
		 * 트와이스 24
		 * 아이유 27
		 * 
		 * 
		 */
		
		//게터 세터 단축키 : Alt + Shift + s 그다음 r //불리언은 get이 is로 시작한다
		
		Singer s1 = new Singer();
		/*
		s1.name = "레드벨벳";
		s1.age = 22;
		*/
		//설정정보 확인하기
		
		//s1.name = "레드벨벳";
		s1.setName("레드벨벳"); //설정이니까 돌려주지 않는다 name에 설정할 값을 넙겨준다
		//s1.age = 22;
		s1.setAge(22);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		
		
		
		
		
		
		
	}

}
