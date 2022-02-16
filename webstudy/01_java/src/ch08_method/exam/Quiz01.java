package ch08_method.exam;

public class Quiz01 {
public static void main(String[] args) {
	// 호출
	
	Sub01 sub = new Sub01();
//	sub.add(5);
	
	
//	sub.method02(5, true);
	
	
	int result = sub.method05(-1);
	System.out.println(result);
	
	Info info = new Info();
	info.num1 = 1000;
	info.num2 = 2000;
	info.num3 = 3000;
//	int sum = sub.method06(info);
//	System.out.println(sum);
	
	System.out.println(sub.method06("+", 20, 10));  //30
	System.out.println(sub.method06("-", 20, 10));   //10
	System.out.println(sub.method06("*", 20, 10));  //400
	System.out.println(sub.method06("/", 20, 10));   //2	
}


}

class Info {
	int num1;
	int num2;
	int num3;

}
