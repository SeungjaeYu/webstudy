/**
 * 목표
 * 
 * 간접처리 + 직접처리 같이 하기
 * 
 * throw 키워드 이해하자..:예외를 직접 발생시키겠다
 * 
 * throw 다음에 오는 것은 예외객체 instance 형태가 와야한다
 * 
 * 
 */
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Alba {
	void work() throws Exception {
		try {
			Scanner sc = new Scanner(new File("a.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("알바 : 자체 분석 시작");
			System.out.println("알바 : 결과 도출...!");
//			throw e;
		}
		//강제로 예외를 만들어야한다면 새로운 객체를 생성시켜주면서
		throw new Exception();
	}
	}


class Boss {
	void manage() {
		Alba a = new Alba();
		try {
			a.work();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("사장 : 예외를 인식했다..");
		}
		
		System.out.println("일 마무리 됨");
	}
}

public class Test12 {
	public static void main(String[] args) {
		Boss b = new Boss();
		b.manage();
		
		
		
		
		
		
	}

}
