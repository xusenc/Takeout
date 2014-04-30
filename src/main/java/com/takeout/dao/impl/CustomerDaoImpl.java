package com.takeout.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.takeout.dao.*;
import com.takeout.domain.*;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public Customer get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Customer.class, id);
	}

	public Integer save(Customer customer) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(customer);
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(customer);

	}

	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(customer);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return (List<Customer>)getHibernateTemplate().find("from Customer");
	}

}
