package com.fenghua.legou.base.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 提供hibernate基本操作
 * @author Fenghua Qiu
 * @param <T>
 */
@Repository
public class BaseDao<T>{
	
    protected static final Logger log = LoggerFactory.getLogger(BaseDao.class);
	
    @Autowired
	private Session session;
    
    private Session getCurrentSession(){
    	return session.getSessionFactory().getCurrentSession();
    }
	/**
	 * 查询一条记录
	 * @param clazz
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T selectOne(T clazz,Serializable id) {
		return (T) getCurrentSession().get(clazz.getClass() ,id);
	}

	/**
	 * 延迟加载
	 * @param clazz
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T  selectOneWithLoad(T clazz,Serializable id){
		return (T) getCurrentSession().load(clazz.getClass(), id);
	}

	/**
	 * 查询多条记录
	 * @param arg0
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> selectList(String hql,Object[] param) {
		return createHql(hql, param).list();
	}

	/**
	 * 查询总数
	 * @param arg0
	 * @return
	 */
	public int getCount(String hql,Object[] param) {
		List<T> list = createHql(hql, param).list();
		if(list!=null)
			return list.size();
		return 0;
	}

	/**
	 * 插入一条记录
	 * 
	 * @param arg0
	 * @return
	 */
	public void insert(Class<T> arg0) {
	  getCurrentSession().save(arg0);
	}

	/**
	 * 更新记录
	 * @param entity
	 * @return
	 */
	public int update(T entity) {
		try {
			getCurrentSession().update(entity);
		} catch (Exception e) {
			log.error("更新出错");
			return 1;
		}
		return -1;
	}


	/**
	 * 删除一条记录
	 * @param entity
	 */
	public boolean  delete(T entity) {
         try {
			getCurrentSession().delete(entity);
		} catch (Exception e) {
			log.error("删除错误");
			return false;
		}
         return true;
	}

	/**
	 * 更新或保存一条记录
	 * @param entity
	 */
	public void saveOrUpdate(T entity){
		getCurrentSession().saveOrUpdate(entity);
		
	}
	/**
	 * 保存记录
	 * @param entity
	 * @return
	 */
	public Serializable save(T entity){
		return  getCurrentSession().save(entity);
	}
	
	
	/**
	 * 执行HQL语句
	 * @param hql
	 * @return
	 */
	public Integer executeHql(String hql,Object...args) {
		return createHql(hql, args).executeUpdate();
	}
	
	public Integer executeHql(Query q){
		return q.executeUpdate();
	}
	/**
	 * 根据条件生成hql语句
	 * @param hql
	 * @param param
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Query createHql(String hql,Object[] param){
		Query query = getCurrentSession().createQuery(hql);
		if(param!=null){
			for(int i = 0;i<param.length;i++){
				query.setParameter(i,param[i]);
			}
		}
		return query;
	}
}
