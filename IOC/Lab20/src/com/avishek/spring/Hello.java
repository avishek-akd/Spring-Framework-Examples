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
	
	



	public Hello(A ao) {
		System.out.println("Hello-(A ao)");
		this.ao = ao;
	}





	public Hello(B bo) {
		System.out.println("Hello-(B bo)");
		this.bo = bo;
	}





	public Hello(A ao, B bo) {
		System.out.println("Hello-(A ao, B bo)");
		this.ao = ao;
		this.bo = bo;
	}





	public void show()
	{
		ao.showA();
		bo.showB();
	}
}
