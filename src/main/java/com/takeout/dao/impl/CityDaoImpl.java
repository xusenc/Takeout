package com.takeout.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.takeout.dao.*;
import com.takeout.domain.*;


public class CityDaoImpl extends HibernateDaoSupport implements CityDao {

	public City get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(City.class, id);
	}

	public Integer save(City city) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(city);
	}

	public void update(City city) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(city);

	}

	public void delete(City city) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(city);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	public List<City> findAll() {
		// TODO Auto-generated method stub
		return (List<City>)getHibernateTemplate().find("from City");
	}

}
