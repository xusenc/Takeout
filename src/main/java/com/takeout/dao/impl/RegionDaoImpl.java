package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.RegionDao;
import com.takeout.domain.Region;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for Region
 *  
 *  @author xusen
 *  @version 1.0
 */
public class RegionDaoImpl 
extends MyHibernateDaoSupport implements RegionDao {
	
	/**
	 * get Region by identity
	 *  @param id
	 *  @return a Region
	 */
	public Region get(Integer id) {
		return (Region)getHibernateTemplate().get(Region.class, id);
	}
	
	/**
	 * save Region into database
	 *  @param a region
	 *  @return saved region' identity
	 */
	public Integer save(Region region) {
		return (Integer)getHibernateTemplate().save(region);
	}
	
	/**
	 * update Region
	 *  @param a region
	 */
	public void update(Region region) {
		getHibernateTemplate().update(region);
	}
	
	/**
	 * delete Region
	 * @param a region
	 */
	public void delete(Region region) {
		getHibernateTemplate().delete(region);
	}
	
	/**
	 * delete Region by identity
	 *  @param a region identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Region
	 *  @return a list for region
	 */
	public List<Region> findAll() {
		return (List<Region>)getHibernateTemplate()
				.find("from Region");
	}
}
