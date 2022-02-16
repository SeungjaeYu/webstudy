/**
 *  Full-Value 어노테이션(속성이 2개 이상일 경우)
 * 
 */
package ch26_annotation.step03;

public @interface Type1 {
	String type() default "a";
	String name() default "b";
	String value() default "c";
}
