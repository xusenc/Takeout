package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Shopimg;
/**
 *  DAO Class for Shopimg
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface ShopimgDao {
	
	/**
	 * get Shopimg by identity
	 *  @param id
	 *  @return a shopimg
	 */
	Shopimg get(Integer id);
	
	/**
	 * save Shopimg into database
	 *  @param a shopimg
	 *  @return saved shopimg' identity
	 */
	Integer save(Shopimg shopimg);
	
	/**
	 * update Shopimg
	 *  @param a shopimg
	 */
	void update(Shopimg shopimg);
	
	/**
	 * delete Shopimg
	 * @param a shopimg
	 */
	void delete(Shopimg shopimg);
	
	/**
	 * delete Shopimg by identity
	 *  @param a shopimg identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Shopimg
	 *  @return a list for shopimg
	 */
	List<Shopimg> findAll();
	
	/**
	 * query and page shopimg
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}