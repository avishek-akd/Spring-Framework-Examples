package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab53 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		
		
		CustomerService csp = (CustomerService) ctx.getBean("cs");
		
		csp.addCustomer();
		csp.updateCustomer();
		
		AccountService asp = (AccountService) ctx.getBean("as");
		
		asp.getBal();
		asp.myDeposit();
		try {
			asp.myWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
}
