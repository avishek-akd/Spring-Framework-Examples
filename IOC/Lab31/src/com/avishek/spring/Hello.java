package com.avishek.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
		@Resource
	private A ao;
		@Resource(name="bobj2")
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
