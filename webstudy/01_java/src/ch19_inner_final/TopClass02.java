package ch19_inner_final;



public class TopClass02 {
	static String data = "TopClass01 data";
	static String data2 = "TopClass01 data2";
	
	
	public void test() {
		StaticMember im = new StaticMember();
		im.call();
		StaticMember.call();
		im.printTopClassData();
	}
	
	static class StaticMember {
		int val = 100;
//		static int val2 = 1020; static 불가능
		static int val2 = 200;
	

		public void test() {
			System.out.println("StaticMember.call ->" + val);
		}
		public static  void call() {
			System.out.println("StaticMember.call ->" + val2);
		}

		public void printTopClassData() {
			System.out.println("InnerMember.printTopClassData ->" + data);
			System.out.println("InnerMember.printTopClassData ->" + data2);

		}
	}

}
