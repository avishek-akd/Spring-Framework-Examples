package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
		@Autowired
	private Hai hai;
	
	static{
		System.out.println("Load Hello Bean");
	}
	
	public  Hello(){
		System.out.println("Class Hello Default Constructor");
	}


	public void show()
	{
		System.out.println(hai);
	}
}
