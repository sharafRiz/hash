package com.simplilearn.mapping;

import java.util.Set;

public class Account {
	
	private int accno;
	private String atype;
	private Double abal;
	Set<Customer> customers;
	
	public Account() {
	
	}
	
	public Account(String atype, Double abal) {
		super();
		
		this.atype = atype;
		this.abal = abal;
	
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public Double getAbal() {
		return abal;
	}

	public void setAbal(Double abal) {
		this.abal = abal;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", abal=" + abal + "]";
	}
	

}
