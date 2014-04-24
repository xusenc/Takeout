package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Shop;
/**
 *  DAO Class for Shop
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface ShopDao {
	
	/**
	 * get Shop by identity
	 *  @param id
	 *  @return a shop
	 */
	Shop get(Integer id);
	
	/**
	 * save Shop into database
	 *  @param a shop
	 *  @return saved shop' identity
	 */
	Integer save(Shop shop);
	
	/**
	 * update Shop
	 *  @param a shop
	 */
	void update(Shop shop);
	
	/**
	 * delete Shop
	 * @param a shop
	 */
	void delete(Shop shop);
	
	/**
	 * delete Shop by identity
	 *  @param a shop identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Shop
	 *  @return a list for shop
	 */
	List<Shop> findAll();
	
	/**
	 * query and page shop
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}