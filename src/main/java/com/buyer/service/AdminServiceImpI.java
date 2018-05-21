package com.buyer.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyer.dao.AdminMapper;
import com.buyer.model.Text;

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
	@Override
	public List<Text> getText() {
		// TODO Auto-generated method stub
		return adm.getText();
	}
	@Override
	public int addText(Text text) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		id = id.replace("-","");
		text.setId(id);
		String tt = text.getText();
		tt = tt + "<br>";
		text.setText(tt);
		return adm.addText(text);
	}
	@Override
	public int deleteTById(String id) {
		// TODO Auto-generated method stub
		return adm.deleteTById(id);
	}

}
