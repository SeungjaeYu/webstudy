package ch23_io.exam;

import java.io.InputStream;

public class Quiz03 {
	public static void main(String[] args) {
		/**
		 * 실행결과>
		 * 한문자를 입력하세요 : m
		 * 입력된 문자는 m 입니다
		 * 한문자를 입력하세요 : q
		 * 종료합니다
		 * 
		 */
		
		/*
		Reader in = new InputStreamReader(System.in);
		try {
			while (true) {
				System.out.print("한문자를 입력하세요 : ");
				int ch = in.read();
				//Character.toUpperCase(ch) == 'Q' 받은 캐릭터를 다 대문자로 만들어줘서 Q가 되면 return;
				if (ch == 'q' || ch == 'Q') {
					System.out.println("종료합니다");
					return;
				}
				System.out.println("입력받은 문자는 " + (char) ch + "입니다");
				// /r /n에 대한 처리
				ch = in.read();
				ch = in.read();
			
			
			}
		} catch (Exception o) {

		}*/
		
		InputStream in = System.in;
		try {
			while (true) {
				System.out.print("한문자를 입력하세요 : ");
				int ch = in.read();
				//Character.toUpperCase(ch) == 'Q' 받은 캐릭터를 다 대문자로 만들어줘서 Q가 되면 return;
				if (ch == 'q' || ch == 'Q') {
					System.out.println("종료합니다");
					return;
				}
				System.out.println("입력받은 문자는 " + (char) ch + "입니다");
				// /r /n에 대한 처리 스킵해라(남은 읽을것들) 이 경우 줄넘김이다 /r/n
				 in.skip(in.available());
				
				
			}
		} catch (Exception o) {
			
		}
		
		
		
		
		
		
		
	}

}
