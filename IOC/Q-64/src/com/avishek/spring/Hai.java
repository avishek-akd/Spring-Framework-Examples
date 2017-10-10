package com.avishek.spring;

public class Hai {
	private Hello hello;
	
	
	static{
		System.out.println("Load Hai Bean");
	}
	
	public  Hai(){
		System.out.println("Class Hai Default Constructor");
	}
	
	
	
	public Hai(Hello hello) {
		System.out.println("Hai-1 arg Constructor");
		this.hello = hello;
	}



	public void show()
	{
		System.out.println(hello);
	}
}
