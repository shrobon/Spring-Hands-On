package com.shrobon.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.shrobon.spring.springaop.ProductServiceImpl.multiply(..))") //execution(....pointcut...)
	public void logBefore(JoinPoint joinPoint){
		System.out.println("Before Calling the method");
	}
	
	
	@After("execution(* com.shrobon.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint){
		System.out.println("After the method invocation");
	}
	
}
