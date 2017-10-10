package com.avishek.spring;



import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Transactional
public class JdbcAccountDAO implements AccountDAO {

	@Autowired
	JdbcTemplate jdbcTemp;
	
	public double getBal(int accno) {
		String sql = "select bal from Account where accno=?";
		double bal = jdbcTemp.queryForObject(sql, Double.class,accno);
		return bal;
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public void deposit(int accno, double amt) {
	
			String sql = "select bal from Account where accno=?";
			double bal = jdbcTemp.queryForObject(sql, Double.class,accno);
			bal = bal+amt;
			sql = "update account set bal=? where accno=?";
			jdbcTemp.update(sql,bal,accno);

	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public void withdraw(int accno, double amt) throws InsufficientFundException {

		String sql = "select bal from Account where accno=?";
		double bal = jdbcTemp.queryForObject(sql, Double.class,accno);
		if (bal>=amt+2000) {
			bal = bal-amt;
			 sql = "update account set bal=? where accno=?";
			jdbcTemp.update(sql,bal,accno);
		} else {
			
			throw new InsufficientFundException();
			
		}
	
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED)
	public void fundTransfer(int saccno, int daccno, double amt) throws InsufficientFundException {
		

		System.out.println(getBal(daccno));
		deposit(daccno, amt);
		System.out.println(getBal(daccno));
		withdraw(saccno, amt);

	}
}
