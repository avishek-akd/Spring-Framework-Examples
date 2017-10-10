package com.avishek.spring;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab44 {
	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		
		System.out.println("----------Spring Container Is Ready----------");
		
		
		BatchTO bto = new BatchTO(1, "06-07-2017", "7.00-9.00", 40);
		
	
		WorkshopTO wto = new WorkshopTO("Spring", 1200.0, 30);
		
		Manager m= (Manager) ctx.getBean("manager");
		m.addBatch(bto);
		m.addWorkshop(wto);
		
	}
}
