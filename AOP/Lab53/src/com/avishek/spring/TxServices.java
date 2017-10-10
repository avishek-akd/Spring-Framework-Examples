package com.avishek.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class TxServices {

	public void runTx(ProceedingJoinPoint pjp) throws Throwable{
		begin();
		
		pjp.proceed();
		
		commit();
		
	}
	
	
	public void begin(){
		System.out.println("TxServices-begin()");
	}
	
	public void commit(){
		System.out.println("TxServices-commit()");
	}
	
	public void rollback(){
		System.out.println("TxServices-rollback()");
	}
}
