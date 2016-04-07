package com.fenghua.legou.core;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceManager<E> implements Service<E>{

	@Autowired
	private GenericDao<E> genericdao;
	
	@Override
	public Serializable insert(E e) {
		if(e==null){
			throw new NullPointerException();
		}
		return genericdao.insert(e);
	}

	@Override
	public boolean delete(E e) {
		if(e==null){
			throw new NullPointerException();
		}
		return genericdao.delete(e);
	}

	@Override
	public int update(E e) {
		if(e==null){
			throw new NullPointerException();
		}
		return genericdao.update(e);
	}

	@Override
	public E selectOne(E e, int id) {
		if(e==null){
			throw new NullPointerException();
		}
		return null;
	}

	@Override
	public List<E> selectList(String hql, Object[] param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(String sql, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
