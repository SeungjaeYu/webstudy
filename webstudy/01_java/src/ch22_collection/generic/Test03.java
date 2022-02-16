/**
 * Generic 클래스 선언하기
 * : 모든 데이터 타입을 받을 수 있으면서 특정한 타입만 받을 수 있게 선언가능하다
 * 
 * class 클래스이름<parameter> parameter는 컴파일할 때 결정
 * 생성: new 클래스이름<parameter>(); 파라미터에 들어갈 데이터 타입을 명시
 * 
 * 파라미터 권장 이름:
 * T : Type
 * E : Element 배열이나 요소값을 담아 한꺼번에 관리
 * K : Key 구분할 때 쓴다
 * V : Value 값
 * N : Number
 * 
 * 
 * 
 */
package ch22_collection.generic;

public class Test03 {
	public static void main(String[] args) {
//		Box03 box = new Box03(); 제너릭인데 오브젝트 처럼 사용. 경고
		
		//타입을 <> 안에 선언해준다
		Box03<String> box = new Box03<String>();
		
		
		box.setData("복숭아 @''@");
//		box.setObjData(100); 문자열이 아닌 값을 주면 컴파일오류
		String data = box.getData();
		System.out.println(data);
		
		
//		Box03<Integer> box2 = new Box03<Integer>();
//		box2.setData(200);
//		int iData = box2.getData();
//		System.out.println(iData);
		
		
		
		
		
		
		
	}

}
