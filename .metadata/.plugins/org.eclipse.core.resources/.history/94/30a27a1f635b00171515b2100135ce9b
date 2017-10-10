package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
		@Autowired
	private A ao;
		@Autowired
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
