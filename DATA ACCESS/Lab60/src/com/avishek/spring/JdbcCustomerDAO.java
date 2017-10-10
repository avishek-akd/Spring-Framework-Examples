package com.avishek.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.PreparedStatementCreator;
public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	
	
	public void addCustomer(CustomerTO cto) {
		final String sql = "insert into customer values(?,?,?,?,?)";
		
		PreparedStatementCreator psc = new PreparedStatementCreator() {
	
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				con.setTransactionIsolation(4);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, cto.getCid());
				ps.setString(2, cto.getCname());
				ps.setString(3, cto.getEmail());
				ps.setLong(4, cto.getPhone());
				ps.setString(5, cto.getCity());
				
				return ps;
			}
		};
		
		getJdbcTemplate().update(psc);	

	}
	
	
	public List<CustomerTO> getAllCustomers() {
		final String sql = "select * from Customer";
		
		PreparedStatementCreator psc = new PreparedStatementCreator() {
	
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				con.setTransactionIsolation(4);
				PreparedStatement ps = con.prepareStatement(sql);
				
				return ps;
			}
		};
		
		List<CustomerTO> list = getJdbcTemplate().query(psc, new CustomerRowMapper());
		return list;
	}



}
