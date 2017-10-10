package com.avishek.spring;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class TestService {
	
	/*@Resource(name="oracleDS")
	private DataSource oracleDS;*/
	
	@Resource(name="mysqlDS")
	private DataSource mysqlDS;
	
	/*
	public void oracleInfo(){
			
			DatabaseMetaData oracledbmd;
			try {
				Connection oraclecon = oracleDS.getConnection();
				oracledbmd = oraclecon.getMetaData();
				System.out.println(oracledbmd.getDatabaseProductName());
				System.out.println(oracledbmd.getDatabaseMajorVersion());
				System.out.println(oracledbmd.getDefaultTransactionIsolation());
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}*/
		
	
	public void mysqlInfo(){
		
		DatabaseMetaData mydbmd;
		try {
			Connection mycon = mysqlDS.getConnection();
			mydbmd = mycon.getMetaData();
			System.out.println(mydbmd.getDatabaseProductName());
			System.out.println(mydbmd.getDatabaseMajorVersion());
			System.out.println(mydbmd.getDefaultTransactionIsolation());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
