package com.takeout.dao.impl;

import java.util.List;

import com.takeout.dao.*;
import com.takeout.domain.*;
import com.takeout.util.*;
/**
 *  Implementation Class for OrdersDao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class OrdersDaoImpl  extends MyHibernateDaoSupport implements OrdersDao {
	
	/**
	 * get Orders by identity
	 *  @param id
	 *  @return a orders
	 */
	public Orders get(Integer id) {
		return getHibernateTemplate().get(Orders.class, id);
	}
	
	/**
	 * save Orders into database
	 *  @param a orders
	 *  @return saved orders' identity
	 */
	public Integer save(Orders orders) {
		return (Integer)getHibernateTemplate().save(orders);
	}
	
	/**
	 * update Orders
	 *  @param a orders
	 */
	public void update(Orders orders) {
		getHibernateTemplate().update(orders);
	}
	
	/**
	 * delete Orders
	 * @param a orders
	 */
	public void delete(Orders orders) {
		getHibernateTemplate().delete(orders);
	}
	
	/**
	 * delete Orders by identity
	 *  @param a orders identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Orders
	 *  @return a list for orders
	 */
	public List<Orders> findAll() {
		return (List<Orders>)getHibernateTemplate()
				.find("from Orders");
	}
}
