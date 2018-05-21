package com.buyer.dao;

import java.util.List;

import com.buyer.model.Text;

public interface AdminMapper {
	
	public String getPW(String name);
	public List<Text> getText();
	public int addText(Text text);
	public int deleteTById(String id);

}
