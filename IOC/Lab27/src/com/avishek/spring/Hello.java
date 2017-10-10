package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
		
	private A ao;
	private B bo;
	
		

	static{
		System.out.println("Load Hello Bean");
	}
	
	
	@Autowired
	public Hello(A ao, B bo) {
		this.ao = ao;
		this.bo = bo;
	}


	public void show()
	{
		ao.showA();
		bo.showB();
	}
}
