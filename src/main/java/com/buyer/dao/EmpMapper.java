package com.buyer.dao;

import java.util.List;

import com.buyer.model.Emp;

public interface EmpMapper {
	public Emp SelectEmpById(String id);
	
	public int DeleteById(String id);
	
	public int Insert(Emp emp);
	
	public int Update(Emp emp);
	
	public String getPW(String name);
	
	List<Emp> getAll();
	
	public int PaySal(String id);

}
