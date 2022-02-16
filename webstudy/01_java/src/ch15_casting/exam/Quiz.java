package ch15_casting.exam;

public class Quiz {
	public static void main(String[] args) {
		
		/*
		//기본형의 참조형 명시적 형변환
		Object obj = new Integer(1);
		obj = new Double(1.1);
		obj = new Boolean(true);
		Object[] arr = new Object[10];
	    */
		
		//board를 담는 리스트
		ObjectArrayList boardList = new ObjectArrayList();
		Board b1 = new Board();
		b1.setNo(1);
		b1.setTitle("형변환 연습");
		
		
		Board b2 = new Board();
		b2.setNo(2);
		b2.setTitle("형변환 연습2");
		
		//b1 b2를 리스트에 추가
		boardList.add(b1);
		boardList.add(b2);
		
		
		System.out.println(boardList.size());
		
		for (int i = 0; i < boardList.size(); i++) {
			Board board = (Board) boardList.get(i);
			System.out.println(board.getNo() + "," + board.getTitle());
		}
		
		
	}

}
