package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	
		
	private A ao;
	private B bo;
	
		

	static{
		System.out.println("Load Hello Bean");
	}
	
	
	@Autowired
	public Hello(@Qualifier("aobj2")A ao, @Qualifier("bobj2")B bo) {
		this.ao = ao;
		this.bo = bo;
	}


	public void show()
	{
		ao.showA();
		bo.showB();
	}
}
