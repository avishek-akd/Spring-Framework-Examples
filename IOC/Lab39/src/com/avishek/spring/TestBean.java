package com.avishek.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class TestBean {

	
	@Autowired
	@Qualifier("oracleDS")
	DataSource oracleDataSource;
	
	
	@Autowired
	@Qualifier("mySqlDS")
	DataSource mySqlDataSource;
	
	public void show(){
		
		System.out.println("===Oracle===\n");
		System.out.println(oracleDataSource);
		
		System.out.println("===Mysql===\n");
		System.out.println(mySqlDataSource);
	}
}
