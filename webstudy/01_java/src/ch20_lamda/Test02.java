package ch20_lamda;

interface Sub02{
	int power(int val);
}

class Child02 implements Sub02{
	public int power(int val) {
		return val * val;
	}
}

public class Test02 {
	public static void main(String[] args) {
		Sub02 s1 = new Child02();
		System.out.println(s1.power(10));
		
		Sub02 s2 = new Sub02() {
			public int power(int val) {
				return val * val;
			}
		};
		System.out.println("익명 " + s2.power(2));
		
		Sub02 s3 = val -> {return val * val;};
		System.out.println("람다 " + s3.power(5));
		
		//return 있을 경우 return을 생략가능하다
		Sub02 s4 = val -> val*val;
		System.out.println("람다 return " + s4.power(4));
		
		
	}

}


