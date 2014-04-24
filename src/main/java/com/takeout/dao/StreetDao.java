package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Street;
/**
 *  DAO Class for Street
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface StreetDao {
	
	/**
	 * get Street by identity
	 *  @param id
	 *  @return a street
	 */
	Street get(Integer id);
	
	/**
	 * save Street into database
	 *  @param a street
	 *  @return saved street' identity
	 */
	Integer save(Street street);
	
	/**
	 * update Street
	 *  @param a street
	 */
	void update(Street street);
	
	/**
	 * delete Street
	 * @param a street
	 */
	void delete(Street street);
	
	/**
	 * delete Street by identity
	 *  @param a street identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Street
	 *  @return a list for street
	 */
	List<Street> findAll();
	
	/**
	 * query and page street
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}