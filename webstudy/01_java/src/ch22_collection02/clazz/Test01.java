/**
 *           <interface>
 *                  Collection  => 데이터를 모아서 관리하는 API
 *             __________|_____________                  
 *      *List                   Set     Queue    Stack    *Map(VO)(collection 하위는 아니지만 데이터를 다룬다)
 *     ___|____              ____|_____                           ___|____
 *    ArrayList - 내부적 배열     TreeSet(정렬)                     TreeMap(정렬)
 *    LinkedList - 내부적 클래스  HashSet                          HashMap(정렬X)
 *  =>메서드가 비슷하다
 * 
 * ArrayList
 * 
 * 
 */
package ch22_collection02.clazz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		//문자열만 담겠다
		List<String> list = new ArrayList<>(); //검색에 좋다
		list = new LinkedList<>();
		
		//데이터 추가 관리
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		
		
		
		//크기
		System.out.println("크기 : "+list.size());
		
		//삭제 0번째 삭제확인
		String rEle = list.remove(0);
	   System.out.println("삭제된 데이터 : " + rEle);
	   
	   //전체데이터 확인
	   System.out.println(list);
	   
	   
	   //0번째 요소 출력
	   System.out.println("0번째 : " + list.get(0));
	   
	   //리스트가 비어있는지 확인
	   System.out.println("비어있어? " + list.isEmpty());
	   
	   //인덱스 번호 찾기 TWO의 위치
	   System.out.println("index : " + list.indexOf("TWO"));
	   System.out.println("index : " + list.indexOf("PEACH")); //없는데이터 확인
	   
	   
	   //요소 포함 boolean
	   System.out.println("THREE가 포함되어있는가 ? " + list.contains("THREE"));
	   
	   
	   
	   //삭제 반환타입 boolean
	   System.out.println("TWO 삭제 되었나? " + list.remove("TWO"));
	   
	   System.out.println("제거 후 : " + list);
	   
	   
	   list.clear();
	   System.out.println("전체 제거 후 :" + list);
	   
		
	}

}
