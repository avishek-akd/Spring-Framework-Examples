package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab20 {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------");
		
		
		Hello h1 = (Hello)ctx.getBean("hello");
		
		h1.show();
		
		
	}
}
