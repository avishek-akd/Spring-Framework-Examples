package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
		@Autowired(required=false)
	private A ao;
		@Autowired(required=false)
	private B bo;
	

	static{
		System.out.println("Load Hello Bean");
	}
	
	public  Hello(){
		System.out.println("Class Hello Default Constructor");
	}
	
	public void show()
	{
		System.out.println(ao);
		System.out.println(bo);
		ao.showA();
		bo.showB();
	}
}
