package com.avishek.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemp;
	
	public void addCustomer(CustomerTO cto) {
		String sql = "insert into customer values(?,?,?,?,?)";
		jdbcTemp.update(sql, cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
	}

	public void updateustomer(CustomerTO cto) {
		String sql = "update  customer set cname=?,email=?,phone=?,city=? where cid=?";
		jdbcTemp.update(sql, cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getCid());
	}

	public void deleteCustomer(int cid) {
		String sql = "delete from Customer where cid=?";
		jdbcTemp.update(sql, cid);
	}

}
