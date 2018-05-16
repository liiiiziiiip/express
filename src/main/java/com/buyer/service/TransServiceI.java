package com.buyer.service;

import java.util.List;

import com.buyer.model.Order;
import com.buyer.model.TransportBill;

public interface TransServiceI {
	List<TransportBill> getAll();
	TransportBill searchById(String id);
	int deleteByid(String id);
	int addTB(TransportBill tb);
	List<TransportBill> searchByRPhone(String phone);
	List<TransportBill> searchBySPhone(String phone);
	List<Order> searchByEID(String id);
	List<Order> searchNewOrder();
	Order searchByTid(String id);
//	List<TransportBill> searchNewTB(String id);
	int update(TransportBill tb);
	int addOrder(Order order);
	int updateOrder(Order order);

}
