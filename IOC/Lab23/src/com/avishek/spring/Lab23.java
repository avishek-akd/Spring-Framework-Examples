package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab23 {
	public static void main(String[] args) {
		
		
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		System.out.println("----------Spring Container Is Ready----------");
	
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
		
	}
}
