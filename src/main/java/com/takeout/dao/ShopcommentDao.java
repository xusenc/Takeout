package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Shopcomment;
/**
 *  DAO Class for Shopcomment
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface ShopcommentDao {
	
	/**
	 * get Shopcomment by identity
	 *  @param id
	 *  @return a shopcomment
	 */
	Shopcomment get(Integer id);
	
	/**
	 * save Shopcomment into database
	 *  @param a shopcomment
	 *  @return saved shopcomment' identity
	 */
	Integer save(Shopcomment shopcomment);
	
	/**
	 * update Shopcomment
	 *  @param a shopcomment
	 */
	void update(Shopcomment shopcomment);
	
	/**
	 * delete Shopcomment
	 * @param a shopcomment
	 */
	void delete(Shopcomment shopcomment);
	
	/**
	 * delete Shopcomment by identity
	 *  @param a shopcomment identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Shopcomment
	 *  @return a list for shopcomment
	 */
	List<Shopcomment> findAll();
	
	/**
	 * query and page shopcomment
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}