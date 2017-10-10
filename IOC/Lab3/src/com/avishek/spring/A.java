package com.avishek.spring;

public class A {
	private int a;
	private String msg;
	
	
	static{
		System.out.println("Load A Bean");
	}
	
	public  A(){
		System.out.println("Class A Default Constructor");
	}
	
	public void setA(int a) {
		System.out.println("Class A - setA()");
		this.a = a;
	}
	public void setMsg(String msg) {
		System.out.println("Class A - setMsg()");
		this.msg = msg;
	}
	
	
	public void showA()
	{
		System.out.println(a);
		System.out.println(msg);
	}
}
