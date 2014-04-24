package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Section;
/**
 *  DAO Class for Section
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface SectionDao {
	
	/**
	 * get Section by identity
	 *  @param id
	 *  @return a Section
	 */
	Section get(Integer id);
	
	/**
	 * save Section into database
	 *  @param a section
	 *  @return saved section' identity
	 */
	Integer save(Section Section);
	
	/**
	 * update Section
	 *  @param a section
	 */
	void update(Section Section);
	
	/**
	 * delete Section
	 * @param a section
	 */
	void delete(Section Section);
	
	/**
	 * delete Section by identity
	 *  @param a section identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Section
	 *  @return a list for section
	 */
	List<Section> findAll();
	
	/**
	 * query and page Section
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}
