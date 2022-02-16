package ch26_annotation.step04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// @Target 설정이 없을 경우 모든 위치 사용가능
@Target({
	ElementType.TYPE,
	ElementType.METHOD,
	ElementType.FIELD,
	ElementType.PARAMETER
})
public @interface MyTarget {}
