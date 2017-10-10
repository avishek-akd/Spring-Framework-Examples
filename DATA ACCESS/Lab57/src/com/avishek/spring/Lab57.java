package com.avishek.spring;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab57 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. Add Customer
		
		CustomerTO cto1  = new CustomerTO(107, "DD", "d@gmail.com", 44444, "Kol");
		cdao.addCustomer(cto1);
		
		//2. Update Customer
		
		CustomerTO cto2  = new CustomerTO(106, "EE", "e@gmail.com", 22222, "Ctc");
		cdao.updateustomer(cto2);
		
		//3. Delete Customer
		
		cdao.deleteCustomer(105);
		
		
		
		
		
	}
}


