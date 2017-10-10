package com.avishek.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import  org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	NamedParameterJdbcTemplate jdbcTemp;
	
	
	
	public void addCustomer(CustomerTO cto) {
			
			String sql = "insert into customer values(:CID,:CNAME,:EMAIL,:PHONE,:CITY)";
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("CID", cto.getCid());
			paramMap.put("CNAME", cto.getCname());
			paramMap.put("EMAIL", cto.getEmail());
			paramMap.put("PHONE", cto.getPhone());
			paramMap.put("CITY", cto.getCity());
			
			jdbcTemp.update(sql, paramMap);
		}
	
	
	public void updateCustomer(CustomerTO cto) {
			
			String sql = "update  customer set cname=:CNAME,email=:EMAIL,phone=:PHONE,city=:CITY where cid=:CID";
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("CID", cto.getCid());
			paramMap.put("CNAME", cto.getCname());
			paramMap.put("EMAIL", cto.getEmail());
			paramMap.put("PHONE", cto.getPhone());
			paramMap.put("CITY", cto.getCity());
			
			jdbcTemp.update(sql, paramMap);
			
		}
	
	
	public void deleteCustomer(int cid) {
			
			String sql = "delete from Customer where cid=:CID";
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("CID", cid);
			
			jdbcTemp.update(sql, paramMap);
		}


	public CustomerTO getCustomerByCid(int cid) {
		String sql = "select * from customer where cid=:CID";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("CID", cid);
		CustomerTO cto = jdbcTemp.queryForObject(sql, paramMap, new CustomerRowMapper());
		return cto;
	}

	

	public List<CustomerTO> getAllCustomers() {
		String sql = "select * from Customer";
		RowMapper rm = new CustomerRowMapper();
		List<CustomerTO> list = jdbcTemp.query(sql,rm);
		
		return list;
	}

	

	

	
	

	

}
