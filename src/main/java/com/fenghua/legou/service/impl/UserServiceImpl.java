package com.fenghua.legou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenghua.legou.dao.UserDao;
import com.fenghua.legou.pojo.User;
import com.fenghua.legou.service.UserService;

/**
 * deal with bussiness about login,register..s
 * @author fenghua 
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao<User,Object> userdao;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> IsLogin(String username, String password) {
		Object[] obj = new Object[]{username,password};
		StringBuffer  buffer  = new StringBuffer();
		buffer.append("from User where username=? and password=?");
		return (List<User>) userdao.get(buffer.toString(),obj);
	}

}
