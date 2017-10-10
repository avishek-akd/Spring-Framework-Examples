package com.avishek.spring;

public class Hai {
	private Hello hello;
	
	
	static{
		System.out.println("Load Hai Bean");
	}
	
	public  Hai(){
		System.out.println("Class Hai Default Constructor");
	}
	
	public void setHello(Hello hello) {
		System.out.println("Class Hai - setHello()");
		this.hello = hello;
	}
	
	public void show()
	{
		System.out.println(hello);
	}
}
