package com.buyer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sun.rmi.transport.proxy.HttpReceiveSocket;

import com.buyer.model.Emp;
import com.buyer.model.Order;
import com.buyer.model.TransportBill;
import com.buyer.service.EmpServiceI;
import com.buyer.service.TransServiceI;
import com.buyer.service.UserServiceI;


@Controller
@RequestMapping(value="/webController")
public class WebController {
	private UserServiceI usi;
	private EmpServiceI empservice;
	private TransServiceI tsi;
	
	@Autowired
	public void setTsi(TransServiceI tsi) {
		this.tsi = tsi;
	}

	@Autowired
	public void setEmpservice(EmpServiceI empservice) {
		this.empservice = empservice;
	}
	
	@Autowired
	public void setUsi(UserServiceI usi) {
		this.usi = usi;
	}
	
	@RequestMapping(value="/Menu")
	public String Menu(String id,HttpServletRequest request) {		
		request.setAttribute("id", id);
		return "User/UserMenu";
	}
	
	@RequestMapping(value="/EMenu")
	public String EMenu(String id,HttpServletRequest request) {		
		request.setAttribute("id", id);
		return "Emp/EmpMenu";
	}
	
	@RequestMapping(value="/test")
	public String test() {		
		System.out.println("webController success!");
		return "success";
	}
	
	@RequestMapping(value="/text")
	public String text(String now,HttpServletRequest request) {		
		request.setAttribute("now", now);
		System.out.println(now);
		return "TransBill/text";
	}
	
	@RequestMapping(value="/updateEmpUI")
	public String updateEmpUI(String id, HttpServletRequest request) {		
		Emp emp = empservice.SelectEmpById(id);
		request.setAttribute("emp", emp);
		return "updateEmp";
	}
	
	@RequestMapping(value="/NewtbUI")
	public String Newtb(String id,HttpServletRequest request) {		
		request.setAttribute("id", id);
//		request.setAttribute("UserKind", usi.userKind(id));
		return "TransBill/NewTB";
	}
	
	@RequestMapping(value="CancelListUI")
	public String CancelList(String id,HttpServletRequest request) {
		List<Order> order = tsi.searchNewOrder();
		List<TransportBill> tb = new ArrayList<TransportBill>();
		for (Order order2 : order) {
			tb.add(tsi.searchById(order2.getT_id()));
		}
		request.setAttribute("tblist", tb);
		request.setAttribute("id", id);		
		return "User/CancelList";
	}
}
