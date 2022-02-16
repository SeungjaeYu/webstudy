/**
 * 목표
 * 
 * 클래스 위쪽에 올 수 있는 것
 * 
 * 주석문 : 어느 위치든 상관없다. 얘만 순서를 바꿀 수 있다
 * 패키지(package) 선언
 * 임폴트(import) :패키지 이름을 포함한 클래스 이름 
 *                     클래스의 위치가 현재 사용하는 클래스와 서로 패키지 위치가 다르면 접근을 직접할 수 없어서 
                       여러 번 선언 가능
 * 클래스(class) 선언
 */
package ch01_basic;

import java.util.Random;//특정한 클래스의 위치를 알려준다
import ch01_basic.exam.Quiz01; //ch01_basic의 폴더안에 exam 폴더 안에 Quiz01을 사용하겠다

public class Test12 {
	public static void main(String[] args) {
		Random r; //Random 클래스도 데이터 타입이 될 수 있다. 객체지향언어\
		Quiz01 q;
	}

}
