package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Orders;
/**
 *  DAO Class for Orders
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface OrdersDao {
	
	/**
	 * get Orders by identity
	 *  @param id
	 *  @return a orders
	 */
	Orders get(Integer id);
	
	/**
	 * save Orders into database
	 *  @param a orders
	 *  @return saved orders' identity
	 */
	Integer save(Orders orders);
	
	/**
	 * update Orders
	 *  @param a orders
	 */
	void update(Orders orders);
	
	/**
	 * delete Orders
	 * @param a orders
	 */
	void delete(Orders orders);
	
	/**
	 * delete Orders by identity
	 *  @param a orders identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Orders
	 *  @return a list for orders
	 */
	List<Orders> findAll();
	
	/**
	 * query and page orders
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}
