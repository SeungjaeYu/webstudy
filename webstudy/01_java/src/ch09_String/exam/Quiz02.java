package ch09_String.exam;



public class Quiz02 {
	public static void main(String[] args) {
		Sub02 s = new Sub02();
		String[] arr = s.split("홍길동:22:서울특별시 마포구", ":");
		
		/*
		 * 홍길동
		 * 22
		 * 서울특별시 마포구
		 * 
		 */
		
		
	//형식 for(배열의 요소값: 반복의 대상 배열이름) 배열의 길이만큼
		for(String data : arr) {
			System.out.println(data);
		}
		
	}

}
