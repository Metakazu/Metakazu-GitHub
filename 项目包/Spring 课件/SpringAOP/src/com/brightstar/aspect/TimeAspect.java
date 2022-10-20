package com.brightstar.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAspect {
	public Object time(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object object = joinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println(joinPoint.getSignature().getName() + "処理にかかった時間は..." + (end - start) + "ミリ秒でした");
		return object;
	}
}
