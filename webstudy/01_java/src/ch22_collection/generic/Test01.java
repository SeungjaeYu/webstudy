/**
 * 
 * 목표
 * 
 * 제너릭문법 이해하기
 * 
 * Object 타입의 장점
 * -여러 데이터 타입을 담을 수 있다.
 * 
 * 
 * 
 * Object 타입의 단점
 * -꺼내어 쓸 때마다 형변환을 시켜줘야한다.
 * -입력되는 값을 특정값으로 제한할 수 없다.
 * -문법적으로는 괜찮지만 컴파일시 오류나기때문에 실행 전까지 알 수 없다.
 *
 * 
 * 
 */
package ch22_collection.generic;

public class Test01 {
	public static void main(String[] args) {
		//box를 사용하기 위해 객체만들기
		Box01 box1 = new Box01();
		box1.setData("복숭아");
//		box1.setData(123);  박스를 담을 때 문자열만 받을 수 있게 만들었으니 컴파일에러. 잘못된데이터 입력되는 걸 막는다.(장점) 이 박스는 문자열밖에 못담는 박스다(단점)
		
		
		
		
		
		/*
		Object[] arr1 = new Object[2];
		arr1[0] = 100;
		arr1[1] = 300;
		
		//실사용때는 하나의 같은 타입으로만 사용한다.
		Object[] arr2 = new Object[2];
		arr2[0] = "java";
		arr2[1] = "hello";
		
		//다양한 타입을 사용하지않는다. 되기는 하지만..
		Object[] arr3 = new Object[2];
		arr3[0] = 200;
		arr3[1] = "hello";
		
		
		
		int val = (Integer)arr3[0];
//		int val2 = (Integer)arr3[1]; 문자열로 들어갔는데 Integer로 바꾸라면 실행 시 오류.,.
		*/
	}

}
