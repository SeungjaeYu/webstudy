package kr.co.mlec.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("time")
public class TimeAspect {
	
	@Around("kr.co.mlec.aop.LogAspect.execute()")
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
			System.out.println("-------------------------");
		}
		return ret;
	}
}




