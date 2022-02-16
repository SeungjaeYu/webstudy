/**
 * 목표
 * 
 * Wrapper
 * 
 * 기본형에 대한 참조형
 * 
 * byte ->   Byte
 * short ->  Short
 * int ->    Integer
 * long ->   Long
 * floar ->  Float
 * double -> Double
 * char ->   Character
 * boolean -> Boolean
 * 
 * 오브젝트에 기본형을 담기위해 참조형을 사용해준다
 * 
 * 
 * 
 * 
 * 
 */
package ch22_collection;

public class Test01 {
	public static void main(String[] args) {
		int i = 100;
		//기본형을 참조형으로 만들었다
		Integer iObj = new Integer(i);
		//주소형값
		Object bj = iObj;
		//원본데이터 꺼내기
		int i2 = iObj.intValue();
		
		double d = 10.2;
		Double dObj = new Double(d);
		

		//1.5버전부터 autoboxing, autounboxing
		//iObj는 주소값 
		//참조형에 기본형을 주면 기본형에 해당하는 참조형을 만들어준다.
		//autoboxing
		Integer iObj2 = 100; //Integer iObj2 = new Integer(100);
		//autounboxing
		int i3 = iObj2; //iObj2.intValue(); AutoUnboxing
		
		Object[] arr = new Object[2];
		arr[0] = 100; //AutoBoxing    arr[0] = new Integer(100);
		arr[1] = 'a'; //arr[1] = new Character('a');
		
		
		
		
		
		
		
	}

}
