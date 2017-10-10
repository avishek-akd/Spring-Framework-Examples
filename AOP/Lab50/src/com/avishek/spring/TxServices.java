package com.avishek.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TxServices {
	
	@Pointcut(value="execution(* com.avishek.spring.AccountService.my*(..))")
	public void PC1(){}
	
	@Pointcut(value="execution(* com.avishek.spring.CustomerService.add*(..))")
	public void PC2(){}
	
	@Before("PC1() || PC2()")
	public void begin(){
		System.out.println("TxServices-begin()");
	}
	
	@AfterReturning("PC1() || PC2()")
	public void commit(){
		System.out.println("TxServices-commit()");
	}
	
	@AfterThrowing("PC1() || PC2()")
	public void rollback(){
		System.out.println("TxServices-rollback()");
	}
}
