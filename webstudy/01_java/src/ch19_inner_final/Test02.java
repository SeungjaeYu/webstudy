/**
 * 목표
 * 
 * 내부클래스 이해하기
 * 
 * 내부클래스 : 최상위 클래스에 포함된 클래스
 * 
 * 
 *  class TopClass{
 *     class Inner{  }
 *       void call() {
 *            class Local { }
 *      }  
 * }
 * 
 * <선언 위치에 따른 분류>
 * -멤버변수 자리에 선언
 * -메서드 안에 선언
 * - 
 * 
 * 
 * 멤버변수 내부클래스 형태
 * class Inner { }
 * static class StaticInner{  }
 *   => static이 붙은 내부클래스가 올 수도 있다
 *   
 *    
 * 1. 멤버변수 자리에 선언되면서 static이 붙지 않은 클래스(InnerClass)
 *  : InnerClass 탑클래스의 변수를 접근할 수 있음    
 *  : static이 붙지 않은 클래스 영역에 선언
 *  : class에만 선언 가능하고 interface에는 선언이 불가
 *  : InnerClass 내부에 static 선언이 불가능
 *  : <외부에서 특정클래스의 내부클래스를 접근하는 방법>
 *   1. 외부클래스 객체 = new 외부클래스();    외부 클래스 객체 하나 생성
 *   2. 외부클래스.내부클래스 변수 = 객체.new 내부클래스();  
 *    
 */
package ch19_inner_final;

/**내부클래스(최상위클래스)*/
public class Test02 {
	public static void main(String[] args) {
		/**내부클래스를 갖고있는 탑클래스 먼저 생각하기*/
		TopClass01 top = new TopClass01();
//		InnerMember im = new InnerMember();  사용못하
				                    /**클래스 생성코드*/
		TopClass01.InnerMember im = top.new InnerMember();
		im.call();
		im.printTopClassData();
		
		
		
	}

}
