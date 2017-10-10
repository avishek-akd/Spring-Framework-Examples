package com.avishek.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab60 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		CustomerTO cto1 = new CustomerTO(666, "TT", "tt@jlc", 89890, "LLK");
		cdao.addCustomer(cto1);
		
		System.out.println("getAllCustomers");
		List<CustomerTO> list = cdao.getAllCustomers();
		for (CustomerTO customerTO : list) {
			System.out.println(customerTO);
		}
		
		
	}
}


