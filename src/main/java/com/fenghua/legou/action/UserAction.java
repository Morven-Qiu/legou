package com.fenghua.legou.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fenghua.legou.pojo.User;
import com.fenghua.legou.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * used to validate login information
 * @author fenghua
 *
 */
public class UserAction extends ActionSupport implements ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3670730551191090674L;
	private HttpServletRequest request;
	private String username;
	private String password;
	private User user;
	@Autowired
	private UserService userService;
	
	public String login(){
		List<User> list = userService.IsLogin(user);
		if(list.size()==1)
		return "success";
		return "error";
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
