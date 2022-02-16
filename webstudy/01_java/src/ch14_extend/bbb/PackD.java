package ch14_extend.bbb;

import ch14_extend.aaa.PackA;//같은 패키지에 없으니 import

public class PackD {
	public static void main(String[] args) {
		PackA pa = new PackA();
//		System.out.println(pa.a);
//		System.out.println(pa.b);
//		System.out.println(pa.c);
		System.out.println(pa.d); //퍼블릭인 d만 에러 X
		
		pa.call1();
//		pa.call2(); 사용X
		
	}

}
