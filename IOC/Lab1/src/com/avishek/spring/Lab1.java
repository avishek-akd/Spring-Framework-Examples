package com.avishek.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		
		
	/*	
	  Object creation And Dependencies Injection Done by U
	 
	
		A aobj = new A();
		aobj.setA(101);
		aobj.setMsg("Debasis");
		
		
		B bobj = new B(111, "Avishek");
		
		
		Hello h = new Hello(bobj);
		h.setAo(aobj);
		
	*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------");
	
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
		
		
	}
}
