package com.takeout.dao.impl;
import java.util.List;

import com.takeout.dao.SellerDao;
import com.takeout.domain.Seller;
import com.takeout.util.MyHibernateDaoSupport;
/**
 *  Implementation Class for SellerDao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class SellerDaoImpl 
extends MyHibernateDaoSupport implements SellerDao {
	
	/**
	 * get Seller by identity
	 *  @param id
	 *  @return a seller
	 */
	public Seller get(Integer id) {
		return getHibernateTemplate().get(Seller.class, id);
	}
	
	/**
	 * save Seller into database
	 *  @param a seller
	 *  @return saved seller' identity
	 */
	public Integer save(Seller seller) {
		return (Integer)getHibernateTemplate().save(seller);
	}
	
	/**
	 * update Seller
	 *  @param a seller
	 */
	public void update(Seller seller) {
		getHibernateTemplate().update(seller);
	}
	
	/**
	 * delete Seller
	 * @param a seller
	 */
	public void delete(Seller seller) {
		getHibernateTemplate().delete(seller);
	}
	
	/**
	 * delete Seller by identity
	 *  @param a seller identity
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	/**
	 * find all Seller
	 *  @return a list for seller
	 */
	public List<Seller> findAll() {
		return (List<Seller>)getHibernateTemplate()
				.find("from Seller");
	}
}
