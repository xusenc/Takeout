package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Region;
/**
 *  DAO Class for Region
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface RegionDao {
	
	/**
	 * get Region by identity
	 *  @param id
	 *  @return a Region
	 */
	Region get(Integer id);
	
	/**
	 * save Region into database
	 *  @param a Region
	 *  @return saved Region' identity
	 */
	Integer save(Region Region);
	
	/**
	 * update Region
	 *  @param a Region
	 */
	void update(Region Region);
	
	/**
	 * delete Region
	 * @param a Region
	 */
	void delete(Region Region);
	
	/**
	 * delete Region by identity
	 *  @param a Region identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Region
	 *  @return a list for Region
	 */
	List<Region> findAll();
	
	/**
	 * query and page Region
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}
