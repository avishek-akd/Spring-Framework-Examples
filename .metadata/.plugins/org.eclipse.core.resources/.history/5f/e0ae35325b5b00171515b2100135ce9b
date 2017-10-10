package com.avishek.spring;

public class Hello {
	private A ao;
	private B bo;
	

	static{
		System.out.println("Load Hello Bean");
	}
	
	public void setAo(A ao) {
		System.out.println("Class Hello - setAo()");
		this.ao = ao;
	}

	
	
	public Hello(B bo) {
		System.out.println("Class Hello 1-arg Constructor");
		this.bo = bo;
	}


	public void show()
	{
		ao.showA();
		bo.showB();
	}
}
