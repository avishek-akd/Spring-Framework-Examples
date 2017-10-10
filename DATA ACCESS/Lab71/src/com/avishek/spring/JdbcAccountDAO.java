package com.avishek.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcAccountDAO implements AccountDAO {

	@Autowired
	JdbcTemplate jdbcTemp;

	public double getBal(int accno) {
		String sql = "select bal from Account where accno=?";
		double bal = jdbcTemp.queryForObject(sql, Double.class,accno);
	
		return bal;
	}

	public void deposit(int accno, double amt) {

			String sql = "select bal from Account where accno=?";
			double bal = jdbcTemp.queryForObject(sql, Double.class,accno);
			bal = bal+amt;
			sql = "update account set bal=? where accno=?";
			jdbcTemp.update(sql,bal,accno);

	}

	public void withdraw(int accno, double amt) throws InsufficientFundException {
	
		
		double bal = getBal(accno);
		if (bal>=amt+2000) {
			bal = bal-amt;
			String sql = "update account set bal=? where accno=?";
			jdbcTemp.update(sql,bal,accno);
		} else {
			throw new InsufficientFundException();
		}

		
	}

	public void fundTransfer(int saccno, int daccno, double amt) throws InsufficientFundException {
		
		
		
		System.out.println(getBal(102));
		deposit(daccno, amt);
		System.out.println(getBal(102));
		withdraw(saccno, amt);

	}
	



}
