package com.avishek.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean {

	@Resource(name="oracleDS")
	DataSource oracleDataSource;
	
	@Resource(name="mySqlDS")
	DataSource mySqlDataSource;
	
	public void show(){
		
		System.out.println("===Oracle===\n");
		System.out.println(oracleDataSource);
		
		System.out.println("===Mysql===\n");
		System.out.println(mySqlDataSource);
	}
}
