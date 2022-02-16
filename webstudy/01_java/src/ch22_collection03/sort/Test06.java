/**
 * Comparator
 */
package ch22_collection03.sort;

import java.util.Arrays;
import java.util.Comparator;

class Data06 {
	private String title;
	private String name;
	private int year;
	
	public Data06(String title, String name, int year) {
		this.title = title;
		this.name = name;
		this.year = year;
	}
	
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("%s-%s(%d)", title, name, year);
	}
	
	
	
}



public class Test06 {
	public static void main(String[] args) {
		Data06 d1 = new Data06("SkyCastle","염정아",2018);
		Data06 d2 = new Data06("제빵왕 김탁구","윤시윤",2010);
		Data06 d3 = new Data06("검색하세요www","임수정",2019);
		Data06 d4 = new Data06("야인시대","안재모",2007);
		
		Data06[] arr = {d1, d2, d3, d4};
		//(정렬할 것 , 정렬의 기준) 한번쓸꺼기때문에 익명클래스<데이터타입>()
		Arrays.sort(arr, new Comparator<Data06>() {

			@Override
			public int compare(Data06 o1, Data06 o2) {
				//방영일 오름차순
				//return o1.getYear()-o2.getYear();
				//방영일 역순
//				return o2.getYear()-o1.getYear();
				//이름순
				return o1.getName().compareTo(o2.getName());
			}
		});;
		
		System.out.println(Arrays.toString(arr));
		
		//원하는 값으로 정렬하기 매번 바꾸지 않고
		
		
		
	}

}
