package com.brightstar.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
	//joinPoint 切入点
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("周边功能日志输出开始log:" + joinPoint.getSignature().getName());//得到方法名
		//执行joinPoint的proceed
		Object object = joinPoint.proceed();
		System.out.println("周边功能日志输出结束log:" + joinPoint.getSignature().getName());
		return object;
	}
}
