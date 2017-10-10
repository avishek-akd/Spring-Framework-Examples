package com.avishek.spring;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Lab37 {
	public static void main(String[] args) {
		
	
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
	
		System.out.println("----------Spring Container Is Ready----------");
	
		Hello h = (Hello)factory.getBean("myhello");
		h.show();
		
		System.out.println("----------Spring Container Is Going To Shut Down----------");
		
	}
}
