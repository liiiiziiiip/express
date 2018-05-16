package com.buyer.dao;

import java.util.List;

import com.buyer.model.*;

public interface UserMapper {
	
	public TUser SelectUserById(String id);
	
	public int DeletById(String id);
	
	public int Insert(TUser user);
	
	public int Update(TUser user);
	public int UpdateByIdSelective(TUser user);
	
	public String getPW(String name);
	
	List<TUser> getAll();
	
	public String getID(String name);
	
	public String getPhone(String id);
	
	public String userKind(String id);

}
