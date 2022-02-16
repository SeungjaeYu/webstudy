/**
 *  어노테이션(Annotation)
 *  
 *  - 클래스, 메서드, 변수 등에 추가적인 데이터(Meta Data)를 붙이는 방식
 *  - XML 설정 부분을 대체
 *    @WebServlet
 *  
 *    <servlet>
 *    	<servlet-name></servlet-name>
 *    	<servlet-class></servlet-class>
 *    </servlet>
 *    <servlet-mapping>
 *    	<servlet-name></servlet-name>
 *    	<url-pattern></url-pattern>
 *    </servlet-mapping>
 *    
 *  - 동적으로 클래스나 메서드에 필요한 메타 정보를 설정하고 이용한다.(리플렉션 + 어노테이션)
 *  - 어노테이션 활용 대표 기술/프레임워크
 *    Struts2
 *    Spring(JAVA, 코틀린)
 *    MyBatis
 *    JPA(요즘 많이 사용??) + SpringBoot + 타임리프(JSP 대체)
 *    
 *  - 생성 규칙
 *    1. interface 키워드와 함께 @로 시작한다.
 *       public @interface 어노테이션명 {
 *       	String value();		-> String => 반환타입 겸 반환 값(value)를 같이 나타낸다.
 *       }
 *    2. 메서드에 파라미터 선언 할 수 없다.
 *    3. 메서드에 throws 선언 할 수 없다.
 *    
 *  - Built-In 어노테이션 : 사용자가 어노테이션을 작성할 때 활용되는 어노테이션(메타 어노테이션)
 *  
 *    1. @Target
 *    	 : 사용자가 정의하는 어노테이션이 어느 위치에서 적용될 수 있는지..
 *       : ElementType.TYPE - 클래스, 인터페이스 선언
 *       : ElementType.METHOD - 메서드
 *       : ElementType.FIELD - 멤버변수
 *       : ElementType.PARAMETER - 매개변수
 *    
 *    2. @Retention
 *       : 작성하는 어노테이션이 어느 시점에 사용될 지
 *       : SOURCE
 *       : CLASS
 *       : RUNTIME - 실행시점에 활용
 *        
 */
package ch26_annotation.step01;


//@My
public class Test {
	
//	@My
	private String msg;
	
	@My
	public static void main(String[] args) {
		
	}

}
