package com.fenghua.legou.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fenghua.legou.core.BaseDao;
import com.fenghua.legou.dao.UserDao;
import com.fenghua.legou.pojo.User;

@Repository
@SuppressWarnings("all")
public class UserDaoImpl implements UserDao {

	@Autowired
	private BaseDao baseDao ;

	@Override
	public Serializable insert(User e) {
		return baseDao.save(e);
	}

	@Override
	public boolean delete(User e) {
		// TODO Auto-generated method stub
		return baseDao.delete(e);
	}

	@Override
	public int update(User e) {
		return baseDao.update(e);
		
	}

	@Override
	public User selectOne(User e,int id) {
		return (User) baseDao.selectOne(User.class, id);
	}

	@Override
	public List<User> selectList(String hql,Object[] param) {
		return baseDao.selectList(hql, param);
	}

	@Override
	public int deleteById(String sql,int id) {
		return baseDao.executeHql(sql, id);
	}

	@Override
	public User selectById(String id) {
		return (User) baseDao.selectOne(User.class, id);
	}


}
