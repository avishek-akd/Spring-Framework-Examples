package com.avishek.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class B {
	private int b;
	private String str;
	

	static{
		System.out.println("Load B Bean");
	}
	

	public  B(){
		System.out.println("Class B Default Constructor");
	}
	
	public B(int b, String str) {
		System.out.println("Class B 2-arg Constructor");
		this.b = b;
		this.str = str;
	}


	@PostConstruct
	public void init1(){
		System.out.println("Class B-init1()");
	}
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("Class B-cleanUp()");
	}
	
	@MyXYZ1
	public void myXYZ(){
		System.out.println("Class B-myXYZ()");
	}
	
	@Override
	public String toString() {
		return b + "\t" + str;
	}
	
	
}
