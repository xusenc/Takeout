package com.takeout.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.takeout.dao.*;
import com.takeout.domain.*;

public class DishCommentDaoImpl extends HibernateDaoSupport implements
		DishCommentDao {

	public DishComment get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(DishComment.class, id);
	}

	public Integer save(DishComment dishComment) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(dishComment);
	}

	public void update(DishComment dishComment) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(dishComment);

	}

	public void delete(DishComment dishComment) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(dishComment);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	public List<DishComment> findAll() {
		// TODO Auto-generated method stub
		return (List<DishComment>)getHibernateTemplate().find("from DishComment");
	}

}
