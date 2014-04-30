package com.takeout.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.takeout.dao.*;
import com.takeout.domain.*;

public class DishDaoImpl extends HibernateDaoSupport implements DishDao {

	public Dish get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Dish.class, id);
	}


	public Integer save(Dish dish) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(dish);
	}


	public void update(Dish dish) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(dish);

	}


	public void delete(Dish dish) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(dish);
	}


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}


	public List<Dish> findAll() {
		// TODO Auto-generated method stub
		return (List<Dish>)getHibernateTemplate().find("from Dish");
	}

}
