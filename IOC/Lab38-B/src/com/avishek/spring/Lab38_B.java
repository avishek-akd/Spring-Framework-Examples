package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab38_B {
	public static void main(String[] args) {
		
		
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
	
		TestBean test = (TestBean) ctx.getBean("test");
		test.show();
		
		
	}
}
