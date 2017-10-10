package com.avishek.spring;

public class AccountService {
	
	public void getBal(){
		System.out.println("AccountService-getBal()");
	}
	
	public void myDeposit(){
		System.out.println("AccountService-myDeposit()");
	}
	
	public void myWithdraw() throws Exception{
		System.out.println("AccountService-myWithdraw() -begin");
		
		if(1==1){
			throw new InsufficientFundsException();
		}
		
		System.out.println("AccountService-myWithdraw() -end");
	}
}
