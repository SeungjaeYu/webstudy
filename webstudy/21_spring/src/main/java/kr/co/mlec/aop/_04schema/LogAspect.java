package kr.co.mlec.aop._04schema;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.stereotype.Component;

@Component("log")
public class LogAspect {
	public void showLog(JoinPoint jp) {
		// JoinPoint jp - 핵심기능클래스인지?? 메서드 인지??
		// target-class => 핵심 기능을 나타냄
		Object target = jp.getTarget();
		Class<?> clz = target.getClass();
		Signature sig = jp.getSignature();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("------------------------------");
		System.out.println("클래스명 : " + clz.getName());
		System.out.println("메서드명 : " + sig.getName());
		System.out.println("호출시간 : " + sdf.format(new Date()));
		System.out.println("------------------------------");
		
	}
}
