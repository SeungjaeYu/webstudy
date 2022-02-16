package kr.co.mlec.aop._05annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// ProceedingJoinPoint => 핵심기능 메소드를 호출할 수 있는 메소드 제공

@Aspect	// 이 클래스는 공통 기능 클래스라고 나타냄
@Component("time")
public class TimeAspect {
	@Around("kr.co.mlec.aop._05annotation.LogAspect.execute()")
	public Object executeTime(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("실행시간 측정 시작");
		long s = System.currentTimeMillis();
		
		// 핵심기능 메서드 호출
		Object ret = null;
		try {
			ret = pjp.proceed();
		} finally {
			long e = System.currentTimeMillis();
			double time = (e - s) / 1000d;
			System.out.println("실행시간 : " + time);
			System.out.println("-------------------------------------");
		}
		return ret;
	}
}
