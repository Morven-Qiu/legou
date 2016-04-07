package com.fenghua.legou.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fenghua.legou.base.dao.BaseDao;
import com.fenghua.legou.dao.UserDao;
import com.fenghua.legou.pojo.User;

@Repository("userDao")
@SuppressWarnings("all")
public class UserDaoImpl implements UserDao {

	@Autowired
	private BaseDao basedao ;

	@Override
	public Serializable insert(UserDao e) {
		return basedao.save(e);
	}

	@Override
	public boolean delete(UserDao e) {
		// TODO Auto-generated method stub
		return basedao.delete(e);
	}

	@Override
	public int update(UserDao e) {
		return basedao.update(e);
	}

	@Override
	public UserDao selectOne(UserDao e,int id) {
		return (UserDao) basedao.selectOne(UserDao.class, id);
	}

	@Override
	public List<UserDao> selectList(String hql,Object[] param) {
		return basedao.selectList(hql, param);
	}

	@Override
	public int deleteById(String sql,int id) {
		return basedao.executeHql(sql, id);
	}

	@Override
	public UserDao selectById(String id) {
		return (UserDao) basedao.selectOne(UserDao.class, id);
	}

}
