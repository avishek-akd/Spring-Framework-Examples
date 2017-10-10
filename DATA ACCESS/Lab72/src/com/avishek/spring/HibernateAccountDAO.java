package com.avishek.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class HibernateAccountDAO implements AccountDAO {

	@Autowired
	HibernateTemplate hTemp;
	

	public double getBal(int accno) {
		Account acc = hTemp.load(Account.class, accno);
		double bal = acc.getBal();
	
		return bal;
	}

	public void deposit(int accno, double amt) {
		
		
			Account acc = hTemp.load(Account.class, accno);
			acc.setBal(acc.getBal()+amt);
			hTemp.update(acc);

		
		
	}

	public void withdraw(int accno, double amt) throws InsufficientFundException {
	
		Account acc = hTemp.load(Account.class, accno);
		if (acc.getBal()>=amt+2000) {
			acc.setBal(acc.getBal()-amt);
			hTemp.update(acc);
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
