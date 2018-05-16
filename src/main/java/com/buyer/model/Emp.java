package com.buyer.model;

public class Emp {
	String e_id;
	String ename;
	int sal;
	int deptno;
	String pw;
	String r_name;
	int age;
	String sex;
	
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Emp [e_id=" + e_id + ", eneme=" + ename + ", sal=" + sal
				+ ", deptno=" + deptno + ", pw=" + pw + ", r_name=" + r_name
				+ ", age=" + age + ", sex=" + sex + "]";
	}


}
