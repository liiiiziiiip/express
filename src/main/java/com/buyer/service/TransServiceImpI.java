package com.buyer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyer.dao.TBMapper;
import com.buyer.model.Order;
import com.buyer.model.TransportBill;

@Service("transService")
public class TransServiceImpI implements TransServiceI {
	private TBMapper tbm;
	
	

	public TBMapper getTbm() {
		return tbm;
	}
	@Autowired
	public void setTbm(TBMapper tbm) {
		this.tbm = tbm;
	}

	@Override
	public List<TransportBill> getAll() {
		// TODO Auto-generated method stub
		return tbm.getAll();
	}

	@Override
	public TransportBill searchById(String id) {
		// TODO Auto-generated method stub
		return tbm.searchById(id);
	}

	@Override
	public int deleteByid(String id) {
		// TODO Auto-generated method stub
		return tbm.deleteById(id);
	}

	@Override
	public int addTB(TransportBill tb) {
		// TODO Auto-generated method stub
		return tbm.add(tb);
	}

	@Override
	//查询收到的快递
	public List<TransportBill> searchByRPhone(String phone) {
		// TODO Auto-generated method stub
		List <Order> order = tbm.searchOrderByRPhone(phone);
		List <TransportBill> tb = new ArrayList<TransportBill>();
		
		for (Order order2 : order) {
			tb.add(tbm.searchById(order2.getT_id()));
		}
		return tb;
	}
	
	@Override
	public List<TransportBill> searchBySPhone(String phone) {
		// TODO Auto-generated method stub
		List <Order> order = tbm.searchOrderBySPhone(phone);
		List <TransportBill> tb = new ArrayList<TransportBill>();
		
		for (Order order2 : order) {
			tb.add(tbm.searchById(order2.getT_id()));
		}
		return tb;
	}

	@Override
	public int update(TransportBill tb) {
		// TODO Auto-generated method stub
		return tbm.update(tb);
	}
	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return tbm.addOrder(order);
	}
	@Override
	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		return tbm.updateOrder(order);
	}
	
	
	@Override
	public List<Order> searchNewOrder() {
		// TODO Auto-generated method stub
		return tbm.searchNewOrder();
	}
	@Override
	public List<Order> searchByEID(String id) {
		// TODO Auto-generated method stub
		return tbm.searchByEID(id);
	}
	@Override
	public Order searchByTid(String id) {
		// TODO Auto-generated method stub
		return tbm.searchByTid(id);
	}

}
