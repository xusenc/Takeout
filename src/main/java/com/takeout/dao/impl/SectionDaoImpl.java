package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.SectionDao;
import com.takeout.domain.Section;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for Section
 *  
 *  @author xusen
 *  @version 1.0
 */
public class SectionDaoImpl 
extends MyHibernateDaoSupport implements SectionDao {
	
	/**
	 * get Section by identity
	 *  @param id
	 *  @return a section
	 */
	public Section get(Integer id) {
		return (Section)getHibernateTemplate().get(Section.class, id);
	}
	
	/**
	 * save Section into database
	 *  @param a orders
	 *  @return saved section' identity
	 */
	public Integer save(Section section) {
		return (Integer)getHibernateTemplate().save(section);
	}
	
	/**
	 * update Section
	 *  @param a section
	 */
	public void update(Section section) {
		getHibernateTemplate().update(section);
	}
	
	/**
	 * delete Section
	 * @param a section
	 */
	public void delete(Section section) {
		getHibernateTemplate().delete(section);
	}
	
	/**
	 * delete Section by identity
	 *  @param a section identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Section
	 *  @return a list for section
	 */
	public List<Section> findAll() {
		return (List<Section>)getHibernateTemplate()
				.find("from Section");
	}
}
