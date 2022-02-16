package ch19_inner_final;




public class Test03 {
	 public static void main(String[] args) {
		TopClass02.StaticMember sm = new TopClass02.StaticMember();
		//nonstatic 들은 객체 생성 후 접근
		System.out.println(sm.val);
		sm.test();
		sm.printTopClassData();

		
		//static 선언된 변수 또는 메서드는 이름으로 접근
		System.out.println(sm.val2);
		System.out.println(TopClass02.StaticMember.val2);
		TopClass02.StaticMember.call();
	 }
	

		
		

}
