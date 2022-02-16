/**
 * 메서드 안에 선언된 내부 클래스
 * 
 * public void call(){
 *    class LocalInner { }
 * 
 * }
 * 3. 지역내부클래스 : 메서드 안에 선언되면서 이름을 가지는 클래스
 *    - 선언된 메서드 내에서만 사용 가능하다
 * 
 * 4. 익명클래스 : 이름이 없는 클래스
 *    - 두가지의 역할을 같이 동시에 한다
 *    - 클래스 선언 + 객체 생성 
 *    <형태>
 *    new 부모클래스 () {
 *         변수
 *         메서드 
 *    };
 *    
 *    익명클래스 변수에 담기
 *    부모클래스 변수 = new 부모클래스() {
 *         변수
 *         메서드 
 *    };
 *    
 *    
 * 
 */
package ch19_inner_final;


class Parent05 {
	void test() {
		System.out.println("Parent05");
	}
}
class Child05 extends Parent05{
	void test() {
		System.out.println("Child05");		
	}
}

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("MyRunnable - run");
	}
}
class MyThread extends Thread{
	public MyThread() {}
	public MyThread(Runnable r) {super(r);}
	
 
}


public class Test05 {
	public void call(Runnable r) {
		
		
	}
	public void test04() {
		Runnable r = new Runnable() {
			public void run() { }
		};
		
		call(r);
		call(new Runnable() {
			public void run() { }
		});
		
		
		Runnable r1 = new MyRunnable();
		Thread mt1 = new MyThread(new MyRunnable());

		Runnable r2 = new Runnable() {
			public void run() {

			}
		};
		Thread mt2 = new Thread( new Runnable() {
			public void run() { } 
			} ) {

		};
	}
	
	
	
	
	
	
	
	
	
	public void test03() {
		
		Runnable r1 = new MyRunnable();
		Thread mt1 = new MyThread(r1);
		
		
		Runnable r2 = new Runnable() {
			public void run() {
				
			}
		};
		Thread mt2 = new Thread(r2) {


		};
		
	}
	
	
	
	
	
	
	
	public void test02() {
		Runnable r = new MyRunnable();
		r.run();
		//익명
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Runnable익명");
			}
		};
		r2.run();
	}
	
	
	
	
	
	
	
	
	public void test01() {
		Parent05 p1 = new Child05();
		p1.test();
		
		// => 익명클래스로 전환
		Parent05 p2 = new Parent05() {
			void test() {
				System.out.println("익명05");		
			}
		};
		p2.test();

	}
	
	public static void main(String[] args) {
		//static은 nonstatic을 바로접근X 객체 생성
		Test05 t = new Test05();
		t.test01();
		t.test02();
		
	}

}
