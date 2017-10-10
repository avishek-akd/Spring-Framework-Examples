package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	
		@Autowired
		@Qualifier("aobj2")
	private A ao;
		@Autowired
		@Qualifier("bobj2")
	private B bo;
	

	static{
		System.out.println("Load Hello Bean");
	}
	
	public  Hello(){
		System.out.println("Class Hello Default Constructor");
	}
	
	public void show()
	{
		ao.showA();
		bo.showB();
	}
}
