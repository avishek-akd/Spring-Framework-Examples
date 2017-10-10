package com.avishek.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringConfig {
	
	/*@Bean
	public DataSource oracleDS(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbs:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("system");
		
		return ds;
	}*/
	
	@Bean
	public DataSource mysqlDS(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/SpringJdbc");
		ds.setUsername("root");
		ds.setPassword("");
		
		return ds;
	}
	
	@Bean(name="ts")
	public TestService testService(){
		return new TestService();
	}
}
