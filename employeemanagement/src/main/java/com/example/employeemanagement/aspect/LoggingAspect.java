package com.example.employeemanagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public * com.example.employeemanagement.service.*.*(..))")
	public void allServiceMethods() {}
	
	@Before("allServiceMethods()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Before method: "+joinPoint.getSignature().getName());
	}
	
	@After("allServiceMethods()")
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println("After Method: "+joinPoint.getSignature());
	}
	
	@AfterReturning(pointcut = "allServiceMethods()", returning="result")
	public void logAfterReturing(JoinPoint joinPoint,Object result)
	{
		System.out.println("Method Returned: "+result);
	}
	
	@AfterThrowing(pointcut = "allServiceMethod()", throwing="error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error)
	{
		System.out.println("Method threw execption: "+error);
	}
	
	@Around("allServiceMethods()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("Before and after method: "+joinPoint.getSignature().getName());
		return joinPoint.proceed();
	}
	
}
