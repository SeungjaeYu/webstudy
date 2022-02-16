/**
 * Static은 JVM에의해서 지워지지 않는다..
 * 
 */

package ch13_static;

public class Test05 {
	public static void main(String[] args) {
		Sub05 s1 = new Sub05(); 
		Sub05 s2 = new Sub05(); 
		System.out.println(s1.k); //100
		s1.k=200;
		s2.k=400;
		System.out.println(s1.k); //400
		System.out.println(s2.k); //400
		Sub05.k=800;
		
		System.out.println(Sub05.k); //800
		System.out.println(s1.k); //800
		System.out.println(s2.k); //800
		
	}

}
