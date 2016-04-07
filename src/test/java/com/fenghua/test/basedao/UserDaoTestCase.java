package com.fenghua.test.basedao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fenghua.legou.dao.UserDao;
import com.fenghua.legou.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/spring.xml","/spring-hibernate.xml,config.properties"})
public class UserDaoTestCase extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private UserDao userDao;
	
	@Test
	public void testCheckLogin(){
		User user = new User();
		userDao.selectList("from User u where u.username=? and u.password=?",new Object[]{"a","123"});
		
	}

}
