package ch26_annotation.step05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)	// 클래스 컴파일 할 때.
public @interface Type1 {
	String value();
}
