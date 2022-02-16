/**
 * 목표
 * 
 * 접근제한자 이해하기
 * 
 *  접근범위 넓은 순 :
 *   public =>  protected   =>  package(default)  => private
 *  누구나가능    상속관계 누구나       같은 패키지에서만        같은 클래스 
 *         같은패키지에서 사용O, 상속
 *    
 *     클래스의 위치는?? 나랑 같은 패키지의 클래스, 나랑 다른 패키지의 클래스
 *    
 *      
 *  외부클래스의 접근제한자는 public, package만 가능
 *  내부클래스 접근제한자는 모두다 가능하다.   
 *     
 *     
 * 
 */
package ch14_extend;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		Random r = new Random();
		int num = r.nextInt(10);
		
		
		/*
		  
		  public class Integer 클래스 {
		                public static int parseInt(String val){
		                return .. 정수값 웅앵웅 
		                }
		   }
		 */
		
		
		
		
	}

}
