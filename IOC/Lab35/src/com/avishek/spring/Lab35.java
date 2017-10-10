package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Lab35 {
	public static void main(String[] args) {
		
		
	//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("/src/spring.xml");
	
	
	
		System.out.println("----------Spring Container Is Ready----------");
	
		Hello h = (Hello)ctx.getBean("myhello");
		h.show();
		
		System.out.println("----------Spring Container Is Going To Shut Down----------");
		ctx.registerShutdownHook();
		
	}
}
