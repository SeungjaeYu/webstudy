package ch22_collection02.clazz.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Holiday{
	private int month;
	
	public Holiday() {}
	public Holiday(int month, int day, String holiy) {
		this.month = month;
		this.day = day;
		this.holiy = holiy;
	}
	protected int getMonth() {
		return month;
	}
	protected void setMonth(int month) {
		this.month = month;
	}
	protected int getDay() {
		return day;
	}
	protected void setDay(int day) {
		this.day = day;
	}
	protected String getHoliy() {
		return holiy;
	}
	protected void setHoliy(String holiy) {
		this.holiy = holiy;
	}
	private int day;
	private String holiy;
	
}




//	public List<Holiday> selectBoard() {
//		return list;
//	}
//
//	public Holiday selectOneBoard(int no) {
//		for (int i = 0; i < list.size(); i++) {
//			Holiday h = list.get(i);
//			if (h.getMonth() != no) continue;
//			return h;
//		}
//		return null;
//	}

class Hohoo {
//	Map<Integer, String> testMap = new TreeMap<>();
//	File f = new File("data/ch22/clazz/exam/quiz04.txt");
//	try
//	{
//		Scanner sc = new Scanner(f);
//
//		while (sc.hasNextLine()) {
//
//			String[] arr = sc.nextLine().split(":");
//			testMap.put(Integer.parseInt(arr[0]), arr[1]);
//		}
//
//	}
//
//	catch(Exception e)
//	{
//		// TODO Auto-generated catch block
////		e.printStackTrace();
//		System.out.println("에러");
//	}
}


	
class Test {
	Scanner sc = new Scanner(System.in);

	int menu() {
		System.out.println("1.전체 휴일보기");
		System.out.println("2.월별 휴일보기");
		System.out.println("0.종료");
		System.out.print("선택 : ");
		return Integer.parseInt(sc.nextLine());

	}

	void service() {

		Hohoo hol = new Hohoo();

		while (true) {
			switch (menu()) {
			case 1:
				select(null);
				break;
			case 2:
				selectOne();
				break;
			case 0:
				sc.close();
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("잘못된 번호입니다");
			}
		}

	}

	void select(Map<Integer, String> testMap) {
		Set<Integer> keySet = testMap.keySet();
		for (Integer key : keySet) {

			System.out.println(key + "월 \n" + testMap.get(key).replace("=", "-").replace(",", "\n"));
			System.out.println("----------------");
		}

	}

	void selectOne() {

	}

}

	
	
	
	



public class Quiz04 {
	public static void main(String[] args) {

			new Test().service();

	}

}
