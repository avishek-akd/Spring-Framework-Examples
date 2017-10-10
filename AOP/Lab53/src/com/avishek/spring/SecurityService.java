package com.avishek.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class SecurityService {
	
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("SecurityService-verifyUser()");
		pjp.proceed();
	}
}
