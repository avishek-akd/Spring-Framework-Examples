package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {
	public static void main(String[] args) {
		
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------");
	
		//Account account = (Account) ctx.getBean("acc");
		//Address address = (Address) ctx.getBean("add");
		
		Customer customer = (Customer) ctx.getBean("cust");
		
		//System.out.println(account);
		//System.out.println(address);
		
		customer.show();
		
	}
}
