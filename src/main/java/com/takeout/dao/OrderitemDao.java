package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Orderitem;
/**
 *  DAO Class for Orderitem
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface OrderitemDao {
	
	/**
	 * get Orderitem by identity
	 *  @param id
	 *  @return a orderitem
	 */
	Orderitem get(Integer id);
	
	/**
	 * save Orderitem into database
	 *  @param a orders
	 *  @return saved orderitem' identity
	 */
	Integer save(Orderitem orderitem);
	
	/**
	 * update Orderitem
	 *  @param a orderitem
	 */
	void update(Orderitem orderitem);
	
	/**
	 * delete Orderitem
	 * @param a orderitem
	 */
	void delete(Orderitem orderitem);
	
	/**
	 * delete Orderitem by identity
	 *  @param a orderitem identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Orderitem
	 *  @return a list for orderitem
	 */
	List<Orderitem> findAll();
	
	/**
	 * query and page orderitem
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}
