package com.buyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyer.dao.AdminMapper;

@Service("adminService")
public class AdminServiceImpI implements AdminServiceI {
	private AdminMapper adm;
	
	public AdminMapper getAdm() {
		return adm;
	}
	@Autowired
	public void setAdm(AdminMapper adm) {
		this.adm = adm;
	}


	@Override
	public String getPW(String name) {
		// TODO Auto-generated method stub
		return adm.getPW(name);
	}

}
