package com.avishek.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab58 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		System.out.println("getCustomerByCid");
		CustomerTO cto = cdao.getCustomerByCid(102);
		System.out.println(cto);
		
		System.out.println("getCustomerByEmail");
		cto = cdao.getCustomerByEmail("d@gmail.com");
		System.out.println(cto);
		
		System.out.println("getAllCustomers");
		List<CustomerTO> list = cdao.getAllCustomers();
		for (CustomerTO customerTO : list) {
			System.out.println(customerTO);
		}
		
		System.out.println("getCustomersByCity");
		list = cdao.getCustomersByCity("ctc");
		for (CustomerTO customerTO : list) {
			System.out.println(customerTO);
		}
		
		
		System.out.println("getCustomersCount");
		int count = cdao.getCustomersCount();
		System.out.println(count);
		
		System.out.println("getCustomerCityByEmail");
		String city = cdao.getCustomerCityByEmail("d@gmail.com");
		System.out.println(city);
		
		System.out.println("getCustomerPhoneByEmail");
		long phone = cdao.getCustomerPhoneByEmail("d@gmail.com");
		System.out.println(phone);
	}
}


