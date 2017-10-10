package com.avishek.spring;

import java.util.List;


import  org.springframework.jdbc.core.RowMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemp;
	


	public CustomerTO getCustomerByCid(int cid) {
		String sql = "select * from customer where cid=?";
		//Object [] args = {cid};
		RowMapper rm = new CustomerRowMapper();
		CustomerTO cto = (CustomerTO )jdbcTemp.queryForObject(sql,rm,cid);
		
		return cto;
	}

	public CustomerTO getCustomerByEmail(String email) {
		String sql = "select * from customer where email=?";
		Object [] args = {email};
		CustomerTO cto = (CustomerTO )jdbcTemp.queryForObject(sql,args,new CustomerRowMapper());
		
		return cto;
	}

	public List<CustomerTO> getAllCustomers() {
		String sql = "select * from Customer";
		RowMapper rm = new CustomerRowMapper();
		List<CustomerTO> list = jdbcTemp.query(sql,rm);
		
		return list;
	}

	public List<CustomerTO> getCustomersByCity(String city) {
		String sql = "select * from Customer where city=?";
		Object [] args = {city};
		RowMapper rm = new CustomerRowMapper();
		List<CustomerTO> list = jdbcTemp.query(sql,args,rm);
		
		return list;
	}

	
	public int getCustomersCount() {
		String sql = "select count(*) from Customer";
		int count = jdbcTemp.queryForObject(sql, Integer.class);
		
		return count;
	}

	public String getCustomerCityByEmail(String email) {
		String sql = "select city from Customer where email=?";
		String city = jdbcTemp.queryForObject(sql, String.class,email);
		
		return city;
		
	}

	public long getCustomerPhoneByEmail(String email) {
		
		String sql = "select phone from Customer where email=?";
		long phone = jdbcTemp.queryForObject(sql, Long.class,email);
		
		return phone;
		
	}

}
