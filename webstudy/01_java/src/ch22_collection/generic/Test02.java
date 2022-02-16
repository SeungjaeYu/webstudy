package ch22_collection.generic;

import javax.swing.Box;

public class Test02 {
	public static void main(String[] args) {
		//타입을 오브젝트로 지정했다
		Box02 box2 = new Box02();
		box2.setData(100);
		box2.setData("복숭아"); //타입이 다르지만 컴파일 에러가 안난다
		
		
		int date = (Integer)box2.getData();
		
		//장점: 다양한 타입을 담는다
		//단점: 형변환을 이용해서 데이터를 갖고와야한다
		
		//원하지 않는 데이터 타입이 입력되는 것을 막을 수 없다.
		
		//실행시 에러 : 컴파일시 체크가 불가능해서
		box2.setData("청포도");
		date = (Integer)box2.getData(); 		
	}

}
