package com.buyer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyer.dao.EmpMapper;
import com.buyer.model.Emp;

@Service("empService")
public class EmpServiceImpI implements EmpServiceI {
	private EmpMapper em;
	

	public EmpMapper getEm() {
		return em;
	}
	@Autowired
	public void setEm(EmpMapper em) {
		this.em = em;
	}

	@Override
	public Emp SelectEmpById(String id) {
		// TODO Auto-generated method stub
		return em.SelectEmpById(id);
	}

	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		return em.getAll();
	}

	@Override
	public int Insert(Emp emp) {
		// TODO Auto-generated method stub
		return em.Insert(emp);
	}

	@Override
	public int Update(Emp emp) {
		// TODO Auto-generated method stub
		return em.Update(emp);
	}

	@Override
	public int DeleteById(String id) {
		// TODO Auto-generated method stub
		return em.DeleteById(id);
	}

	@Override
	public String getPW(String name) {
		// TODO Auto-generated method stub
		return em.getPW(name);
	}
	@Override
	public int PaySal(String id) {
		// TODO Auto-generated method stub
		return em.PaySal(id);
	}

}
