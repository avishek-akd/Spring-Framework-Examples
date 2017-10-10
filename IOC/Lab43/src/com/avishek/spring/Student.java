package com.avishek.spring;

import java.util.List;

import javax.annotation.Resource;

public class Student {
	
	private String sname;
	private long phone;
	
	@Resource
	private List<String> emails;
	
	@Resource
	private List<Long> phones;
	
	@Resource
	private StudentID sid;
	
	@Resource
	private Fee fee;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Long> getPhones() {
		return phones;
	}
	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}
	
	
	
	public StudentID getSid() {
		return sid;
	}
	public void setSid(StudentID sid) {
		this.sid = sid;
	}
	
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return sname + "\t" + phone + "\t" + emails + "\t" + phones;
	}
 	
	
	
}
