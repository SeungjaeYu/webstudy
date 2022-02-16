package ch07_class;

public class Test02 {
	public static void main(String[] args) {
		Bread[] arr = new Bread[3]; 
		Bread b = new Bread();
		b.name = "소보로";
		b.price = 1000;
		arr[0] = b;
		
		b.name = "피자빵";
		System.out.println(b.name);
		System.out.println(arr[0].name); // arr[0]이 가르키고 있는 주소값의 .name을 찾아라
		
//		String aaa = arr[0]; // 오류
		Bread aaa = arr[0]; //값을 받을 때 타입. *Bread* Bread로 받아서
		
		arr[1] = new Bread();
		arr[1].name = "콩빵";
		arr[1].price = 2000;
		
	}

}
