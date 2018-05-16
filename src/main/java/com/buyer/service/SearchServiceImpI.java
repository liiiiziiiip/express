package com.buyer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyer.dao.TBMapper;
import com.buyer.model.TransportBill;

@Service("searchService")
public class SearchServiceImpI implements SearchServiceI{
	private TBMapper tbm;

	public TransportBill searchById(String id) {
		// TODO Auto-generated method stub
//		System.out.println("imp/sbi");
		TransportBill tb = tbm.searchById(id);
		System.out.println(tb);
//		return tbm.searchById(id);
		return tb;
	}
	
//	public List<User> ugetAll() {
//		// TODO Auto-generated method stub
//		return um.getAll();
//	} 

	public TBMapper getTbm() {
		return tbm;
	}
	
	@Autowired
	public void setTbm(TBMapper tbm) {
		this.tbm = tbm;
	}

	public List<TransportBill> getAll() {		
		return tbm.getAll();
	}
	
	public String deleteByid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addTB(TransportBill tb) {
		// TODO Auto-generated method stub
		return null;
	}

}
