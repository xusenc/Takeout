package com.takeout.dao;

import java.util.List;

import com.takeout.domain.Seller;
/**
 *  DAO Class for Seller
 *  
 *  @author xusen
 *  @version 1.0
 */
public interface SellerDao {
	
	/**
	 * get Seller by identity
	 *  @param id
	 *  @return a seller
	 */
	Seller get(Integer id);
	
	/**
	 * save Seller into database
	 *  @param a seller
	 *  @return saved seller' identity
	 */
	Integer save(Seller seller);
	
	/**
	 * update Seller
	 *  @param a seller
	 */
	void update(Seller seller);
	
	/**
	 * delete Seller
	 * @param a seller
	 */
	void delete(Seller seller);
	
	/**
	 * delete Seller by identity
	 *  @param a seller identity
	 */
	void delete(Integer id);
	
	/**
	 * find all Seller
	 *  @return a list for seller
	 */
	List<Seller> findAll();
	
	/**
	 * query and page seller
	 *  @param a hql to query
	 *  @param initial offset to query
	 *  @param a page's length
	 *  @return a list for result 
	 */
	List findByPage(final String hql, final int offset, final int pageSize);
}