package com.avishek.spring;

public class Hello {
	private A ao;
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
