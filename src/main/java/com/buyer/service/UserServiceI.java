package com.buyer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buyer.model.TUser;
import com.buyer.model.User;

public interface UserServiceI {
	TUser SelectUserById(String id);	
	List<TUser> getAll();
	int Insert(TUser user);
	int Update(TUser user);
	int UpdateByIdSelective(TUser user);
	int DeletById(String id);
	String getPW(String name);
	String getID(String name);
	String userKind(String id);

}
