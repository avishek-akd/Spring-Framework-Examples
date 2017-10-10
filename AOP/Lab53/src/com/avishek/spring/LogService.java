package com.avishek.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LogService {

		
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
		
		public void logThrowing(){
			System.out.println("LogService-logThrowing()");
		}
		
		public void logOk(){
			System.out.println("LogService-logOk()");
		}
		
}
