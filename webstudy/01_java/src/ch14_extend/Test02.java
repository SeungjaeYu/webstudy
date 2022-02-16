/**
 * 목표
 * 
 * 
 * 상속의 개념 및 특징을 이해하자
 * 
 * 1. 재사용성 : 기존에 있는 것을 또 쓰지않고 나한테 있지않지만 있는 것처럼 사용할 수 있다.
 * 2. 확장성 
 * 3. ex) Manager02 class가 Employee02 클래스를 상속받고 싶다
 *    > extends 키워드를 사용(class 가 class 를 상속할 때 사용)
 *    public class Manager02 extends Employee02
 *     =>매니저02는 임플로이02를 상속받겠습니다.
 *    Manager02는 Employee02의 변수 및 메서드를 사용 할 수 있다.
 *    
 * 4.상속시 주의점??
 *  상속한 객체를 생성하면 자기뿐만 아니라 상속한 클래스의 메모리도 같이 만들어진다.
 *  ex) Manager02 m = new Manager02();
 *    Employee02 메모리도 같이 만들어진다.
 *    
 *    ====|====
 *      A | e(), f(), g() 를 새로 생성하면
 *        |
 *      B | e(), f(), g() 도 같이 생겨진다. 쓸데X
 *        |
 * 
 *    관계를 한 번 더 체크체크 A is B ?? 
 *     A is B의 관계는 아니지만 기능이 유사하다면 상속 할 수 있다. 80%이상 유사하다면..
 *      =>요즘은 권장하지 않음..
 *   
 *     A has B => 권장
 *     
 * 5. 상속클래스를 지칭하는 용어
 *  public class Manager02 extends Employee02
 *  
 *      Employee02
 *      : 부모, 상위, super
 *      
 *      Manager02
 *      : 자식, 하위, sub
 *      
 *      
 * 6. 자식 클래스(Manager02)는 부모 클래스(Employee02)의 변수나 메서드를 마치 자신의 것처럼 
 *   접근해서 사용할 수 있다.
 *   단, 부모 클래스의 접근제한자가 접근 범위에 있어야한다. ex) private 자기 클래스에서만 사용가능. 접근x      
 *     
 * 호출 :
 *      자기자신 지칭 : this
 *      부모의 지칭 : super.변수
 *                  super.메서드()
 *                  super() -> 생성자
 *                  
 * super, this 둘 다 맨 위에서만 선언이 가능하기 때문에 중복X                 
 *                  
 * extends를 받았지만 name을 그냥 썼을 땐 자기 자신 것. 부모의 것을 쓰고싶다면 super를 붙여라.                
 */

package ch14_extend;

public class Test02 {
	public static void main(String[] args) {
		/**Employee02불러오기*/
		Employee02 e1 = new Employee02();
		/**사원번호1*/
		e1.setEmpNo(1);
		/**이름 아놀드*/
		e1.setName("아놀드");
		
		 
		Employee02 e2 = new Employee02(2, "실버스타");
		
		
		Manager02 m = new Manager02(3, "다우니");
		
		
		//선언하지않았지만 extends로 사용 할 수 있다.
		m.setEmpNo(11);
		
		
		/**관리자한테 사원을 관리하라는 메서드*/
		m.addEmployee(e1);
		m.addEmployee(e2);
		/**관리하는 사원 출력*/
		System.out.println(m.info());
		
		
		
		
		
		/* 사원정보 확인
		System.out.println(e1.info());
		System.out.println(e2.info());
		*/
		
		
		
		
		
		
	}
	
	

}
