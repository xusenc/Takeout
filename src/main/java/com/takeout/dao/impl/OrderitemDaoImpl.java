package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.OrderitemDao;
import com.takeout.domain.Orderitem;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for Orderitem
 *  
 *  @author xusen
 *  @version 1.0
 */
public class OrderitemDaoImpl 
extends MyHibernateDaoSupport implements OrderitemDao {
	
	/**
	 * get Orderitem by identity
	 *  @param id
	 *  @return a orderitem
	 */
	public Orderitem get(Integer id) {
		return (Orderitem)getHibernateTemplate().get(Orderitem.class, id);
	}
	
	/**
	 * save Orderitem into database
	 *  @param a orders
	 *  @return saved orderitem' identity
	 */
	public Integer save(Orderitem orderitem) {
		return (Integer)getHibernateTemplate().save(orderitem);
	}
	
	/**
	 * update Orderitem
	 *  @param a orderitem
	 */
	public void update(Orderitem orderitem) {
		getHibernateTemplate().update(orderitem);
	}
	
	/**
	 * delete Orderitem
	 * @param a orderitem
	 */
	public void delete(Orderitem orderitem) {
		getHibernateTemplate().delete(orderitem);
	}
	
	/**
	 * delete Orderitem by identity
	 *  @param a orderitem identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Orderitem
	 *  @return a list for orderitem
	 */
	public List<Orderitem> findAll() {
		return (List<Orderitem>)getHibernateTemplate()
				.find("from Orderitem");
	}
}
