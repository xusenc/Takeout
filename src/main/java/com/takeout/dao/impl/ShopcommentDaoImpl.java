package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.ShopcommentDao;
import com.takeout.domain.Shopcomment;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for ShopcommentDao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class ShopcommentDaoImpl 
extends MyHibernateDaoSupport implements ShopcommentDao {
	
	/**
	 * get Shopcomment by identity
	 *  @param id
	 *  @return a shopcomment
	 */
	public Shopcomment get(Integer id) {
		return getHibernateTemplate().get(Shopcomment.class, id);
	}
	
	/**
	 * save Shopcomment into database
	 *  @param a shopcomment
	 *  @return saved shopcomment' identity
	 */
	public Integer save(Shopcomment shopcomment) {
		return (Integer)getHibernateTemplate().save(shopcomment);
	}
	
	/**
	 * update Shopcomment
	 *  @param a shopcomment
	 */
	public void update(Shopcomment shopcomment) {
		getHibernateTemplate().update(shopcomment);
	}
	
	/**
	 * delete Shopcomment
	 * @param a shopcomment
	 */
	public void delete(Shopcomment shopcomment) {
		getHibernateTemplate().delete(shopcomment);
	}
	
	/**
	 * delete Shopcomment by identity
	 *  @param a shopcomment identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Shopcomment
	 *  @return a list for shopcomment
	 */
	public List<Shopcomment> findAll() {
		return (List<Shopcomment>)getHibernateTemplate()
				.find("from Shopcomment");
	}
}
