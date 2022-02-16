package kr.co.mlec.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("log")
public class LogAspect {
	
	@Pointcut("execution(public * kr.co.mlec.aop..*Controller.service(..))")
	public void execute() {}
	
//	@Before("execution(public * kr.co.mlec.aop..*Controller.service(..))")
	@Before("execute()")
	public void showLog(JoinPoint jp) {
		// JoinPoint jp - 핵심기능클래스인지?? 메서드 인지??
		// 핵심기능 클래스
		Object target = jp.getTarget();
		Class<?> clz = target.getClass();
		Signature sig = jp.getSignature();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("-----------------------------");
		System.out.println("클래스명 : " + clz.getName());
		System.out.println("메서드명 : " + sig.getName());
		System.out.println("호출시간 : " + sdf.format(new Date()));
		System.out.println("-----------------------------");
	}
}






