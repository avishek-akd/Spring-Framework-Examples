package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q64 {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------");
	
		
		Hai hai = (Hai) ctx.getBean("hai");
		Hello hello = (Hello) ctx.getBean("hello");
		
		hai.show();
		hello.show();
		
	}
}
