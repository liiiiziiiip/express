package com.buyer.dao;

import java.util.List;

import com.buyer.model.Order;
import com.buyer.model.TransportBill;

public interface TBMapper {
	public TransportBill searchById(String id);
	public List<TransportBill> searchByPhone(String phone);
	public int update(TransportBill tb);
	List<TransportBill> getAll();
	public int deleteById(String id);
	public int add(TransportBill tb);
	public int addOrder(Order order);
	public List<Order> searchOrderBySPhone(String phone);
	public List<Order> searchOrderByRPhone(String phone);
	public List<Order> searchNewOrder();
	public List<Order> searchByEID(String id);
	Order searchByTid(String id);
	public int updateOrder(Order order);
//	public String updateNow(String now);
}