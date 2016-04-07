package com.fenghua.legou.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

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
	
	
	
	
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}


}
