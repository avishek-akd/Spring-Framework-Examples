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
	
	public void setAo(A ao) {
		System.out.println("Class Hello - setAo()");
		this.ao = ao;
	}

	
	public void setBo(B bo) {
		System.out.println("Class Hello - setBo()");
		this.bo = bo;
	}



	public void show()
	{
		System.out.println(ao);
		System.out.println(bo);
		ao.showA();
		bo.showB();
	}
}
