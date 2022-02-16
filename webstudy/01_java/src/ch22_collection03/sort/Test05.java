package ch22_collection03.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * API sort를 이용해서 정렬 : 객체의 원하는 필드
 */
//compareTo을 사용하기위해 상속시켜줬다..
class Data05 implements Comparable<Data05>{
	private String name;
	private int age;
	

	Data05(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	
	@Override//Comparable의 메서드 재정의 
	
	public int compareTo(Data05 o) {
//		System.out.println(this.getName() +"-"+ o.getName());
		 //int값에 따라 위치 바뀐다. 
		 //0은 위치를 바꾸지 않겠다
		 //음수 : 비교대상보다 앞으로 이동
		 //양수 : 비교대상보다 뒤로 이동
		//*-1 내림차순
// 이름순 return this.getName().compareTo(o.getName()) * -1;
// 나이순	return this.getAge()-(o.getAge());
		if(this.getName() == o.getName()) {
			return this.getAge()-(o.getAge());
		}
		return this.getName().compareTo(o.getName());
		
		/* 선생님
		int result = this.getName().charAt(0) - o.getName().charAt(0);
		return result == 0? o.getAge()- this.getAge()
		*/
				
	}

	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);
	}
	
	
}


public class Test05 {
	public static void main(String[] args) {
		
		/**b와 a를 비교해서(아스키코드) 숫자값 출력. 아스키코드 더한 값이 아니다*/
		/*
		System.out.println("b".compareTo("a")); //1
		System.out.println("b".compareTo("b")); //0
		System.out.println("b".compareTo("c")); //-1
		System.out.println("hi".compareTo("ha")); //hi 가 크다. i 와 a
		System.out.println("hi".compareTo("i")); //하나하나 따져봐서 h와 i를 따졌다-1
		System.out.println("가".compareTo("나")); 
		System.out.println("정윤오".compareTo("이민형")); 
		*/
		
		Data05 d1 = new Data05("정윤오", 23); 
		Data05 d2 = new Data05("이민형", 21); 
		Data05 d3 = new Data05("이동혁", 20); 
		Data05 d4 = new Data05("나재민", 20); 
		Data05 d5 = new Data05("김동영", 24);
		
		//list로 자동정렬
		List<Data05> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		
		Collections.sort(list);
		System.out.println(list);
		
		/*
		Data05[] arr = {d1, d2, d3, d4, d5};
		//(Comparable)arr[0] 형변환시켜주자 상속을 받아야한다
		
		
		//주소값이 나온다
		System.out.println(Arrays.toString(arr));
	
		//이름으로 정렬 API를 사용하자
		//형변환을 Comparable로 할 수없어서 에러. 
		//Data05클래스의 compareTo 메서드를 호출
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		
	}

}
