package com.avishek.spring;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	
		@Inject
	private A ao;
		@Inject
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
