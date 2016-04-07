package com.fenghua.legou.core;

import java.io.Serializable;
import java.util.List;

/**
 * generic interface for DAO
 * 此接口提供DAO层基本数据库操作，所有DAO都必须实现此接口
 * @author fenghua
 * @param <T>
 * @param <PK>
 */
public interface GenericDao <E>{
	
	/**
	 * 插入
	 * 
	 * @param e
	 * @return
	 */
	public Serializable insert(E e);

	/**
	 * 删除
	 * 
	 * @param e
	 * @return
	 */
	public boolean delete(E e);

	/**
	 * 更新
	 * 
	 * @param e
	 * @return
	 */
	public int update(E e);

	/**
	 * 查询一条记录
	 * 
	 * @param e
	 * @return
	 */
	public E selectOne(E e,int id);
	
	/**
	 * 根据条件查询所有
	 * @return
	 */
	public List<E> selectList(String hql,Object[] param);

	/**
	 * 根据ID来删除一条记录
	 * @param id
	 */
	public int deleteById(String sql,int id);

	/**
	 * 根据ID查询一条记录
	 * @param id
	 * @return
	 */
	public E selectById(String id);
	

}
