package com.avishek.spring;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab54 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		
		TestService ts = (TestService) ctx.getBean("ts");
		ts.mysqlInfo();
	}
}


