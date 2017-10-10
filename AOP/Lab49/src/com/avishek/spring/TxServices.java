package com.avishek.spring;

public class TxServices {
	
	public void begin(){
		System.out.println("TxServices-begin()");
	}
	
	public void commit(){
		System.out.println("TxServices-commit()");
	}
	
	public void rollback(){
		System.out.println("TxServices-rollback()");
	}
}
