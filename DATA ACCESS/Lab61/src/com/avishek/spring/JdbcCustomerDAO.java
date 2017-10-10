package com.avishek.spring;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;



import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.SqlParameter;
public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	
	
	public void addCustomer(CustomerTO cto) {
		final String sql = "call addCustomer(?,?,?,?,?)";
		
		CallableStatementCreator csc = new CallableStatementCreator() {
			
			
			public CallableStatement createCallableStatement(Connection con) throws SQLException {
				CallableStatement cs = con.prepareCall(sql);
				cs.setInt(1, cto.getCid());
				cs.setString(2, cto.getCname());
				cs.setString(3, cto.getEmail());
				cs.setLong(4, cto.getPhone());
				cs.setString(5, cto.getCity());
				
				
				return cs;
			}
		};
		
		SqlParameter charParam = new SqlParameter(Types.VARCHAR);
		SqlParameter intParam = new SqlParameter(Types.INTEGER);
		SqlParameter longParam = new SqlParameter(Types.LONGNVARCHAR);
		
		List<SqlParameter> plist = new  ArrayList<SqlParameter>();
			plist.add(intParam);
			plist.add(charParam);
			plist.add(charParam);
			plist.add(longParam);
			plist.add(charParam);
		
		
		getJdbcTemplate().call(csc, plist);

	}
	


}
