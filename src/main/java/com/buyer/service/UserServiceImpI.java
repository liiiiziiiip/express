package com.buyer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyer.dao.EmpMapper;
import com.buyer.dao.UserMapper;
import com.buyer.model.TUser;
import com.buyer.model.User;

@Service("userService")
public class UserServiceImpI implements UserServiceI{
	private UserMapper userM;
	private EmpMapper empM;
	
	@Autowired
	public void setEmpM(EmpMapper empM) {
		this.empM = empM;
	}
	public TUser SelectUserById(String id){
		return userM.SelectUserById(id);
		
	}
	@Autowired
	public void setUserMapper(UserMapper userM) {
		this.userM = userM;
	}
	public List<TUser> getAll() {
		// TODO Auto-generated method stub
		return userM.getAll();
	}

	public int Insert(TUser user) {
		// TODO Auto-generated method stub
		return userM.Insert(user);
	}

	public int Update(TUser user) {
		// TODO Auto-generated method stub
		return userM.Update(user);
	}

	public int DeletById(String id) {
		// TODO Auto-generated method stub
		return userM.DeletById(id);
	}
	public String getPW(String name) {
		// TODO Auto-generated method stub
		return userM.getPW(name);
	}
	@Override
	public String getID(String name) {
		// TODO Auto-generated method stub
		return userM.getID(name);
	}
	@Override
	public int UpdateByIdSelective(TUser user) {
		// TODO Auto-generated method stub
		return userM.UpdateByIdSelective(user);
	}
	@Override
	public String userKind(String id) {
		// TODO Auto-generated method stub
		if(userM.SelectUserById(id) != null) {
			return "U";
		}
		else if(empM.SelectEmpById(id) != null) {
			return "E";
		}
		return null;
	}

}
