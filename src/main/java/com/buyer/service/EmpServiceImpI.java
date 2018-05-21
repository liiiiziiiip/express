package com.buyer.service;

import java.util.List;
import java.util.UUID;

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
	public boolean Insert(Emp emp) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		id = id.replace("-","");
		emp.setE_id(id);
		if (em.getPW(emp.getEname()) != null) {
			return false;
		}
		else {
			em.Insert(emp);
			return true;
		}
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
	@Override
	public String getId(String name) {
		// TODO Auto-generated method stub
		return em.getId(name);
	}

}
