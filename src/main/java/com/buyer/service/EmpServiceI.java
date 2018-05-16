package com.buyer.service;

import java.util.List;

import com.buyer.model.Emp;

public interface EmpServiceI {
	Emp SelectEmpById(String id);	
	List<Emp> getAll();
	int Insert(Emp emp);
	int Update(Emp emp);
	int DeleteById(String id);
	String getPW(String name);
	int PaySal(String id);

}
