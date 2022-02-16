package ch08_method.exam;


class People {
	String name;
	int age;
}


public class Quiz04 {
	public static void main(String[] args) {
		/**놀이공원에 사람이 여러사람 갔다.
		 * 
		 *  사람들의 나이에 대한 정보.
		 *  3명의 정보
		 *  
		*/
		
		People p1 = new People();
		p1.name = "J.Fla"; 
		p1.age = 33;
		
		
		People p2 = new People();
		p2.name = "새송";
		p2.age = 10;
		
		
		
		People[] arr = {p1, p2};
		
		Sub04 s = new Sub04();
		//넘겨받은 people 정보를 토탈 가격을 맥여준다
		int fee = s.totFee(arr);
		System.out.printf("전체 요금 : %d원 %n" , fee);
		
		
		
		
		
		
		
		
				
		
		
		
	}

}
