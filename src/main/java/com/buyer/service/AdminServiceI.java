package com.buyer.service;

import java.util.List;

import com.buyer.model.Text;

public interface AdminServiceI {
	
	String getPW(String name);
	List<Text> getText();
	int addText(Text text);
	int deleteTById(String id);

}
