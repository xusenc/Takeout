package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.ShopDao;
import com.takeout.domain.Shop;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for ShopDao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class ShopDaoImpl 
extends MyHibernateDaoSupport implements ShopDao {
	
	/**
	 * get Shop by identity
	 *  @param id
	 *  @return a shop
	 */
	public Shop get(Integer id) {
		return getHibernateTemplate().get(Shop.class, id);
	}
	
	/**
	 * save Shop into database
	 *  @param a shop
	 *  @return saved shop' identity
	 */
	public Integer save(Shop shop) {
		return (Integer)getHibernateTemplate().save(shop);
	}
	
	/**
	 * update Shop
	 *  @param a shop
	 */
	public void update(Shop shop) {
		getHibernateTemplate().update(shop);
	}
	
	/**
	 * delete Shop
	 * @param a shop
	 */
	public void delete(Shop shop) {
		getHibernateTemplate().delete(shop);
	}
	
	/**
	 * delete Shop by identity
	 *  @param a shop identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Shop
	 *  @return a list for shop
	 */
	public List<Shop> findAll() {
		return (List<Shop>)getHibernateTemplate()
				.find("from Shop");
	}
}
