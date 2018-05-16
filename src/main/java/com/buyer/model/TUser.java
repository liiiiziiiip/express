package com.buyer.model;

public class TUser {
	private String uname;
	private String pw;
	private String name;
	private String phone;
	private String address;
	private int debt;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDebt() {
		return debt;
	}
	public void setDebt(int debt) {
		this.debt = debt;
	}
	@Override
	public String toString() {
		return "TUser [uname=" + uname + ", pw=" + pw + ", name=" + name
				+ ", phone=" + phone + ", address=" + address + ", debt="
				+ debt + "]";
	}
	

}
