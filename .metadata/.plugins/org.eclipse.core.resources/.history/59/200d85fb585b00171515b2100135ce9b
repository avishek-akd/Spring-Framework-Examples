package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean(name="aobj1")
	public A createA1(){
		A aobj = new A();
		aobj.setA(101);
		aobj.setMsg("Debasis");
		
		return aobj;
	}
	
	@Bean(name="aobj2")
	public A createA2(){
		A aobj = new A();
		aobj.setA(102);
		aobj.setMsg("XXXXXXXX");
		
		return aobj;
	}
	
	@Bean(name="bobj")
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
