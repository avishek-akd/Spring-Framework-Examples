package com.avishek.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {

	
	@Pointcut(value="execution(* com.avishek.spring.AccountService.my*(..))")
	public void PC1(){}
	
	@Pointcut(value="execution(* com.avishek.spring.CustomerService.add*(..))")
	public void PC2(){}
	
		@Around("PC1() || PC2()")
		public void log(ProceedingJoinPoint pjp) throws Throwable{
			logBefore();
			
			pjp.proceed();
			
			logReturning();
		}
		
		public void logBefore(){
			System.out.println("LogService-logBefore()");
		}
		
		public void logReturning(){
			System.out.println("LogService-logReturning()");
		}
		
		@AfterThrowing("PC1() || PC2()")
		public void logThrowing(){
			System.out.println("LogService-logThrowing()");
		}
		
		@After("PC1() || PC2()")
		public void logOk(){
			System.out.println("LogService-logOk()");
		}
		
}
