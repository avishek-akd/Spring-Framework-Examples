package com.avishek.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	
	@Pointcut(value="execution(* com.avishek.spring.AccountService.*(..))")
	public void PC1(){}
	
	@Pointcut(value="execution(* com.avishek.spring.CustomerService.add*(..))")
	public void PC2(){}
	
	@Around("PC1() || PC2()")
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("SecurityService-verifyUser()");
		pjp.proceed();
	}
}
