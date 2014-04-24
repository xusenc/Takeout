package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.StreetDao;
import com.takeout.domain.Street;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for StreetDao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class StreetDaoImpl 
extends MyHibernateDaoSupport implements StreetDao {
	
	/**
	 * get Street by identity
	 *  @param id
	 *  @return a street
	 */
	public Street get(Integer id) {
		return getHibernateTemplate().get(Street.class, id);
	}
	
	/**
	 * save Street into database
	 *  @param a street
	 *  @return saved street' identity
	 */
	public Integer save(Street street) {
		return (Integer)getHibernateTemplate().save(street);
	}
	
	/**
	 * update Street
	 *  @param a street
	 */
	public void update(Street street) {
		getHibernateTemplate().update(street);
	}
	
	/**
	 * delete Street
	 * @param a street
	 */
	public void delete(Street street) {
		getHibernateTemplate().delete(street);
	}
	
	/**
	 * delete Street by identity
	 *  @param a street identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Street
	 *  @return a list for street
	 */
	public List<Street> findAll() {
		return (List<Street>)getHibernateTemplate()
				.find("from Street");
	}
}
