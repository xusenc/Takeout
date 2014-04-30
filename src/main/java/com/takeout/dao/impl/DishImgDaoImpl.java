package com.takeout.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.takeout.dao.*;
import com.takeout.domain.*;

public class DishImgDaoImpl extends HibernateDaoSupport implements DishImgDao {

	public DishImg get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(DishImg.class, id);
	}


	public Integer save(DishImg dishImg) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(dishImg);
	}


	public void update(DishImg dishImg) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(dishImg);

	}


	public void delete(DishImg dishImg) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(dishImg);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}


	public List<DishImg> findAll() {
		// TODO Auto-generated method stub
		return (List<DishImg>)getHibernateTemplate().find("from DishImg");
	}

}
