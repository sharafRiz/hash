package com.simplilearn.mapping;

public class Student {

	int sid;
	
	String sname;
	String email;
	String sphone;
	
	Address address;
	
	public Student() {
		super();
	}
	
	
	public Student(String sname, String email, String sphone, Address address) {
		super();
	
		this.sname = sname;
		this.email = email;
		this.sphone = sphone;
		this.address = address;
	}
	
	public Student(int side, String sname, String email, String sphone, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.sphone = sphone;
		this.address = address;
	}


	public int getSide() {
		return sid;
	}


	public void setSide(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSphone() {
		return sphone;
	}


	public void setSphone(String sphone) {
		this.sphone = sphone;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", sphone=" + sphone + "]";
	}
	
}
