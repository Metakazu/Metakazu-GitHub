package com.brightstar.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
	@Around(value = "execution(* com.brightstar.service.TimeService.*(..))")
	public Object time(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object object = joinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println(joinPoint.getSignature().getName() + "処理にかかった時間は..." + (end - start) + "ミリ秒でした");
		return object;
	}
}
