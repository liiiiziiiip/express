package com.buyer.controller;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buyer.model.Order;
import com.buyer.model.TUser;
import com.buyer.model.TimeFormat;
import com.buyer.model.TransportBill;
import com.buyer.service.TransServiceI;
import com.buyer.service.UserServiceI;


@Controller
@RequestMapping(value="/tbController")
public class TBController {
	private TransServiceI tsi;
	private UserServiceI usi;
	private static final Logger logger = Logger.getLogger(TBController.class);
	

	public UserServiceI getUsi() {
		return usi;
	}
	@Autowired
	public void setUsi(UserServiceI usi) {
		this.usi = usi;
	}
	public TransServiceI getTsi() {
		return tsi;
	}
	@Autowired
	public void setTsi(TransServiceI tsi) {
		this.tsi = tsi;
	}
	
	@RequestMapping(value="/NewtbUI")
	public String Newtb(String id,HttpServletRequest request) {		
		request.setAttribute("id", id);
//		request.setAttribute("UserKind", usi.userKind(id));
		return "TransBill/NewTB";
	}
	
	@RequestMapping(value="/addTB")
	public String addTB(String id,TransportBill tb) {
		TimeFormat tf = new TimeFormat();
		String T_id = UUID.randomUUID().toString();
		T_id = T_id.replace("-","");
		String O_id = UUID.randomUUID().toString();
		O_id = O_id.replace("-","");
		tb.setT_id(T_id);
		tb.setT_now(tf.getTime() + ":创建物流<br>");
		tsi.addTB(tb);
		Order order = new Order();
		order.setO_id(O_id);
		order.setT_id(T_id);
		order.setU_id(id);
		order.setR_phone(tb.getR_phone());
		order.setS_phone(usi.SelectUserById(id).getPhone());
		order.setS_name(tb.getS_name());
		order.setR_name(tb.getR_name());
		order.setTime(tf.getTime());
		tsi.addOrder(order);
//		request.setAttribute("id", id);
		return "redirect:/tbController/List.do";
	}
	
	@RequestMapping(value="/List")
	public String List(HttpServletRequest request) {
		List<TransportBill> tb = tsi.getAll();
		request.setAttribute("tblist", tb);
		System.out.println(tb);
		return "TransBill/List";
//		return "success";
	}
	
	@RequestMapping(value="/TBfromOther")
	public String TBfromOther(String id,HttpServletRequest request) {
		TUser user = usi.SelectUserById(id);
		List<TransportBill> tb = tsi.searchByRPhone(user.getPhone());
		request.setAttribute("tblist", tb);
		return "TransBill/UList";
//		return "success";
	}
	
	@RequestMapping(value="/TBfromSelf")
	public String TBfromSelf(String id,HttpServletRequest request) {
		TUser user = usi.SelectUserById(id);
		List<TransportBill> tb = tsi.searchBySPhone(user.getPhone());
		request.setAttribute("tblist", tb);
		return "TransBill/UList";
//		return "success";
	}
	
	@RequestMapping(value="/NewtbList")
	public String NewtbList(String id,HttpServletRequest request) {
		TUser user = usi.SelectUserById(id);
//		List<TransportBill> ptb = new ArrayList<TransportBill>();
		String tb = "[";
		List<Order> order = tsi.searchNewOrder();
		for (Order order2 : order) {
//			ptb.add(tsi.searchById(order2.getT_id()));
			tb = tb + tsi.searchById(order2.getT_id()).JStoString() + ",";
		}
		tb = tb + "]";
		request.setAttribute("tblist", tb);
//		request.setAttribute("ptblist", ptb);
		request.setAttribute("user", user);
		request.setAttribute("id", id);
//		return "TransBill/List";
		return "TransBill/TestList";
//		return "success";
	}
	
	@RequestMapping(value="TBofMe")
	public String TBofMe(String id, HttpServletRequest request) {
		List<Order> order = tsi.searchByEID(id);
		List<TransportBill> tb = new ArrayList<TransportBill>();
		for (Order order2 : order) {
			tb.add(tsi.searchById(order2.getT_id()));
		}
		request.setAttribute("tblist", tb);
		request.setAttribute("id", id);
		return "TransBill/List";
	}
	
	@RequestMapping(value="/EaddTB")
	public String EaddTB(String id,TransportBill tb) {
		TimeFormat tf = new TimeFormat();
		String T_id = UUID.randomUUID().toString();
		T_id = T_id.replace("-","");
		String O_id = UUID.randomUUID().toString();
		O_id = O_id.replace("-","");
		tb.setT_id(T_id);
		tb.setT_now(tf.getTime() + ":创建物流<br>");
		tsi.addTB(tb);
		Order order = new Order();
		order.setO_id(O_id);
		order.setT_id(T_id);
//		order.setU_id(id);
		order.setE_id(id);
		order.setR_phone(tb.getR_phone());
		order.setS_phone(tb.getS_phone());
		order.setS_name(tb.getS_name());
		order.setR_name(tb.getR_name());
		order.setTime(tf.getTime());
		tsi.addOrder(order);
//		request.setAttribute("id", id);
//		return "redirect:/tbController/List.do";
		return "success";
	}
	
	@RequestMapping(value="CancelList")
	public String CancelList(String id,HttpServletRequest request) {
		Order order = tsi.searchByTid(id);
		
			TimeFormat tf = new TimeFormat();
			String x = order.getTime();
			x = x + tf.getTime() + "用户取消";
			TransportBill tb = tsi.searchById(id);
			String y = tb.getT_now();
			y = y + tf.getTime() + "用户取消";
			tb.setT_now(y);
			tsi.update(tb);
			
			order.setE_id("NULL");
			order.setTime(x);
			tsi.updateOrder(order);
		
		String path = request.getServletPath();
		System.out.println(path);
		
		return "success";
	}
	
	@RequestMapping(value="verifyTB")
	public String verifyTB(String t_id,String id) {
		TimeFormat tf = new TimeFormat();
		TransportBill tb = tsi.searchById(t_id);
		String now = tb.getT_now();
		now = now + tf.getTime() + ":确认订单<br>";
		tb.setT_now(now);
		tsi.update(tb);
		Order order = tsi.searchByTid(t_id);
		String time = order.getTime();
		time = time + tf.getTime() + ":确认订单<br>";
		order.setE_id(id);
		tsi.updateOrder(order);
		logger.info(order);
		logger.info(tb);
		
		return "success";
	}
	
	@RequestMapping(value="RejectTB")
	public String RejectTB(String t_id) {
		TimeFormat tf = new TimeFormat();
		TransportBill tb = tsi.searchById(t_id);
		String now = tb.getT_now();
		now = now + tf.getTime() + ":拒绝订单<br>";
		tb.setT_now(now);
		tsi.update(tb);
		Order order = tsi.searchByTid(t_id);
		String time = order.getTime();
		time = time + tf.getTime() + ":拒绝订单<br>";
		order.setE_id("NULL");
		tsi.updateOrder(order);
		logger.info(order);
		logger.info(tb);
		return "success";
	}
	
	@RequestMapping(value="updateTBUI")
	public String updateTBUI(String id,HttpServletRequest request) {
		TransportBill tb = tsi.searchById(id);
		request.setAttribute("tb", tb);
		request.setAttribute("id", id);
		logger.info(tb);
		return "TransBill/UpdateTB";
	}
	
	@RequestMapping(value="updateTB")
	public String updateTB(String e_id,TransportBill tb,String updateNow) {
		TimeFormat tf = new TimeFormat();
		String now = tb.getT_now();
		now = now + tf.getTime() + ":" + updateNow + "<br>";
		tb.setT_now(now);
		tsi.update(tb);
		logger.info(tb);
		return "success";
	}
	
	@RequestMapping(value="NewTBFromEmpUI")
	public String NewTBFromEmpUI(String id, HttpServletRequest request) {
		request.setAttribute("id", id);
		return "Emp/NewTB";
	}
	
	@RequestMapping(value="orderList")
	public String orderList(HttpServletRequest request) {
		List<Order> order = tsi.getOrderAll();
		request.setAttribute("OList", order);
		
		return "TransBill/OrderList";
	}
	
	@RequestMapping(value="TBDetail")
	public String TBDetail(String id,HttpServletRequest request) {
		TransportBill tb = tsi.searchById(id);
		request.setAttribute("tb", tb);		
		return "TransBill/transBill";
	}
	
	@RequestMapping(value="delete")
	public String delete(String id) {
		Order order = tsi.searchByTid(id);
		TimeFormat tf = new TimeFormat();
		String time = order.getTime();
		time = time + tf + ":" + "删除详单<br>";
		order.setTime(time);	
		return "success";
	}
}
