package com.avishek.spring;

public class Hello {
	private Hai hai;
	
	

	static{
		System.out.println("Load Hello Bean");
	}
	
	public  Hello(){
		System.out.println("Class Hello Default Constructor");
	}
	
	public void setHai(Hai hai) {
		System.out.println("Class Hello - setHai()");
		this.hai = hai;
	}

	

	public void show()
	{
		System.out.println(hai);
	}

	
	
}
