package com.buyer.service;

import java.util.List;

import com.buyer.model.TransportBill;
import com.buyer.model.User;

public interface SearchServiceI {
	
	List<TransportBill> getAll();
	TransportBill searchById(String id);
	String deleteByid(String id);
	String addTB(TransportBill tb);
//	List<User> ugetAll();
}
