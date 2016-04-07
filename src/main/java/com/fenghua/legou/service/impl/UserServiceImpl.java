package com.fenghua.legou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenghua.legou.core.ServiceManager;
import com.fenghua.legou.dao.UserDao;
import com.fenghua.legou.pojo.User;
import com.fenghua.legou.service.UserService;

/**
 * deal with bussiness about login,register..s
 * @author fenghua 
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl extends ServiceManager<User> implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public List<User> IsLogin(User user) {
		StringBuffer str = new StringBuffer();
		str.append("from User u where u.username=? and u.password=?");
	    return userDao.selectList(str.toString(), new Object[]{user.getUsername(),user.getPassword()});
	}

}
