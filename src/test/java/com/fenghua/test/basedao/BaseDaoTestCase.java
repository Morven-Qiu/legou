package com.fenghua.test.basedao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.fenghua.legou.base.dao.BaseDao;
import com.fenghua.legou.pojo.User;

import junit.framework.TestCase;

public class BaseDaoTestCase extends TestCase{
	
	
	@Test
	public void testselectOne(){
		Configuration config = new Configuration().configure("src/test/resources/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		BaseDao<User> base = new BaseDao<User>();
		
		session.get(User.class, 1);
			
	}
	

}
