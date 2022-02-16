package ch11_datastruct.exam;

public class Quiz01 {
	public static void main(String[] args) {
	    ArrayList list = new ArrayList();
			System.out.println(list);
   
			list.add("손흥민");
			list.add("김연아");
			list.add("박항서");
			list.add("이강인");
			list.add("박지성");
			
			// ArrayList[손흥민, 김연아, 박항서, 이강인, 박지성]
			// ArrayList 클래스에 toString 메서드를 재정의하라..
			System.out.println(list);
			
			String data = list.get(0);
			System.out.println(data);  // 화면에 손흥민 출력
			
			int size = list.size();
			System.out.println(size);  // 화면에 5 출력
			
			// 삭제 기능
			list.remove(1);  // 김연아 삭제함..
			System.out.println(list.size());  // 4
			// ArrayList[손흥민, 박항서, 이강인, 박지성]
			System.out.println(list);
			
			list.clear(); // 전체 데이터 삭제
			System.out.println(list.size());  // 0
			// ArrayList[]
			System.out.println(list);
			
			System.out.println(list.isEmpty());  // true
			list.add("이강인");
			list.add("마이클조던");
			
			list.add(1, "손연재");
			// ArrayList[이강인, 손연재, 마이클조던]
			System.out.println(list);
	}
}


