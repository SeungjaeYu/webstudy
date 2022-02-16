package ch13_static;

public class Sub04 {
	int i = 100;
	static int k = 100;
	static {
		k = 200;
		System.out.println(1);
	}
	Sub04() {
		System.out.println(2);
	}
	
	

}
