package com.buyer.controller;

import java.util.List;
import java.util.UUID;
import java.lang.ProcessBuilder.Redirect;
import java.lang.String;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ReplaceOverride;
import org.springframework.stereotype.Controller;

import com.buyer.model.Emp;
import com.buyer.model.TUser;
import com.buyer.model.User;
import com.buyer.service.AdminServiceI;
import com.buyer.service.EmpServiceI;
import com.buyer.service.UserServiceI;

@Controller
@RequestMapping(value = "/userController")
public class UserController {
	private UserServiceI userservice;
	private EmpServiceI empservice;
	private AdminServiceI adminservice;
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	
	
	public AdminServiceI getAdminservice() {
		return adminservice;
	}
	@Autowired
	public void setAdminservice(AdminServiceI adminservice) {
		this.adminservice = adminservice;
	}
	public EmpServiceI getEmpservice() {
		return empservice;
	}
	@Autowired
	public void setEmpservice(EmpServiceI empservice) {
		this.empservice = empservice;
	}

	public UserServiceI getuserservice() {
		return userservice;
	}
	
	@Autowired
	public void setuserservice(UserServiceI userservice) {
		this.userservice = userservice;
	}//
	
	@RequestMapping(value = "/list")	
	public String listUser(HttpServletRequest request) {
		
		List <TUser> list = userservice.getAll();
		request.setAttribute("userlist", list);
		return "list";
	}
	
	@RequestMapping(value = "/Emplist")	
	public String listEmp(HttpServletRequest request) {
		
		List <Emp> list = empservice.getAll();
		request.setAttribute("Emplist", list);
		return "EmpList";
	}
	
	@RequestMapping(value="/login-check")
	public String login(String name,String password,String userKind,HttpServletRequest request) {
		System.out.println(name + password);
		if(userKind.equals("user")){
			String upw = userservice.getPW(name);
			System.out.println(upw);
				if(password.equals(upw)) {
					request.setAttribute("id",userservice.getID(name));
					return "User/User";
//					return "redirect:/User/User?id=" + userservice.getID(name);
//					return "redirect:/User/User";
					}
//			return "/Controller/list.do";
				else
					return "error";
		}
		else if(userKind.equals("emp")){
			String epw = empservice.getPW(name);
			System.out.println("ePW" + epw);
				if(password.equals(epw))
					return "Emp/Emp";
				else
					return "error";
		}
		else if(userKind.equals("admin")){
			String apw = adminservice.getPW(name);
			System.out.println("aPW" + apw);
				if(password.equals(apw))
					return "Admin";
				else
					return "error";
		}
		return "error";
	}
	
	@RequestMapping(value="/addEmp")
	public String addUser(Emp emp) {
		String id = UUID.randomUUID().toString();
		id = id.replace("-","");
		emp.setE_id(id);
		empservice.Insert(emp);
		return "redirect:/userController/Emplist.do";
	}
	
	@RequestMapping(value="/addUser")
	public String addUser(TUser user) {
		String id = UUID.randomUUID().toString();
		id = id.replace("-","");
		user.setId(id);
		userservice.Insert(user);
		return "success";
	}
	
	@RequestMapping(value="/deleteEmp")
	public String deleteEmp(String id) {
		empservice.DeleteById(id);
		return "redirect:/userController/Emplist.do";
	}
	
	@RequestMapping(value="/updateEmpUI")
	public String updateEmpUI(String id, HttpServletRequest request) {		
		Emp emp = empservice.SelectEmpById(id);
		request.setAttribute("emp", emp);
		return "updateEmp";
	}
	
	@RequestMapping(value="/updateEmp")
	public String updateEmp(Emp emp) {		
		empservice.Update(emp);
		return "redirect:/userController/Emplist.do";
	}
	
	@RequestMapping(value="/Menu")
	public String Menu(String id,HttpServletRequest request) {		
		request.setAttribute("id", id);
		return "User/UserMenu";
	}
	
	@RequestMapping(value="/updateUserUI")
	public String updateUserUI(String id, HttpServletRequest request) {		
		TUser user = userservice.SelectUserById(id);
		logger.info(user);
		request.setAttribute("user", user);
		return "User/UpdateUser";
	}
	
	@RequestMapping(value="/updateUser")
	public String updateUser(TUser user) {		
		userservice.UpdateByIdSelective(user);
		logger.info("updateUser");
		return "success";
	}
	
	@RequestMapping(value="/payDebt")
	public String payDebt(String id) {
		TUser user = userservice.SelectUserById(id);
		user.setDebt(0);
		userservice.UpdateByIdSelective(user);
		logger.info(user);
		return "success";
	}

}
