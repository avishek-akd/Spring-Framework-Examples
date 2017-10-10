package com.avishek.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan(basePackages={"com.avishek.spring"})
public class SpringConfig {
	
	
	
	@Bean
	public DataSource mysqlDS(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/SpringJdbc");
		ds.setUsername("root");
		ds.setPassword("");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemp(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	
}
