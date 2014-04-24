package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.ShopimgDao;
import com.takeout.domain.Shopimg;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for ShopimgDao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class ShopimgDaoImpl 
extends MyHibernateDaoSupport implements ShopimgDao {
	
	/**
	 * get Shopimg by identity
	 *  @param id
	 *  @return a shopimg
	 */
	public Shopimg get(Integer id) {
		return getHibernateTemplate().get(Shopimg.class, id);
	}
	
	/**
	 * save Shopimg into database
	 *  @param a shopimg
	 *  @return saved shopimg' identity
	 */
	public Integer save(Shopimg shopimg) {
		return (Integer)getHibernateTemplate().save(shopimg);
	}
	
	/**
	 * update Shopimg
	 *  @param a shopimg
	 */
	public void update(Shopimg shopimg) {
		getHibernateTemplate().update(shopimg);
	}
	
	/**
	 * delete Shopimg
	 * @param a shopimg
	 */
	public void delete(Shopimg shopimg) {
		getHibernateTemplate().delete(shopimg);
	}
	
	/**
	 * delete Shopimg by identity
	 *  @param a shopimg identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Shopimg
	 *  @return a list for shopimg
	 */
	public List<Shopimg> findAll() {
		return (List<Shopimg>)getHibernateTemplate()
				.find("from Shopimg");
	}
}
