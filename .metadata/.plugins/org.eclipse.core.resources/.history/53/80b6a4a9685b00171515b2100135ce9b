package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Import {
	public static void main(String[] args) {
		
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring1.xml","spring2.xml");
		
		System.out.println("----------Spring Container Is Ready----------");
	
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
		
	}
}
