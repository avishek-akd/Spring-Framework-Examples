package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public A createA(){
		A aobj = new A();
		aobj.setA(101);
		aobj.setMsg("Debasis");
		
		return aobj;
	}
	
	@Bean
	public B createB(){
		B bobj = new B(111, "Avishek");
		
		return bobj;
	}
	
	@Bean(name="hello", autowire=Autowire.BY_TYPE)
	public Hello createHello(){
		Hello h = new Hello();
		return h;
	}
}
