package com.avishek.spring;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab55 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		
		TestService ts = (TestService) ctx.getBean("ts");
		ts.mysqlInfo();
	}
}


