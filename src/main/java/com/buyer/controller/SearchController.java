package com.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import com.buyer.model.TransportBill;
import com.buyer.service.SearchServiceI;

@Controller
@RequestMapping(value="/SearchController")
public class SearchController {
	private SearchServiceI searchservice;
	
	@RequestMapping(value="/searchById")
	public String searchbyId(String t_id,HttpServletRequest request)
	{
		
		TransportBill list = searchservice.searchById(t_id);
		request.setAttribute("TBD", list);
		System.out.println(list);
//		String result = list.toString();
		return "viewTB";
//		return result;
//		return "success";
	}
	
	@RequestMapping(value="/TBlist")
	public String TBlist(HttpServletRequest request)
	{
		
		List<TransportBill> TBL = searchservice.getAll();
		request.setAttribute("TBL", TBL);
//		String result = list.toString();
		return "success";
//		return result;
	}

	public SearchServiceI getSearchservicr() {
		return searchservice;
	}
	
	@Autowired
	public void setSearchservicr(SearchServiceI searchservicr) {
		this.searchservice = searchservicr;
	}
	

}
