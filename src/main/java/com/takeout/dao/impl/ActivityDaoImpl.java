package com.takeout.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.takeout.dao.*;
import com.takeout.domain.*;

public class ActivityDaoImpl extends HibernateDaoSupport implements ActivityDao {

	public Activity get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Activity.class, id);
	}


	public Integer save(Activity acivity) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(acivity);
	}


	public void update(Activity acivity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(acivity);

	}


	public void delete(Activity acivity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(acivity);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}


	public List<Activity> findAll() {
		// TODO Auto-generated method stub
		return (List<Activity>)getHibernateTemplate().find("from Activity");
	}

}
