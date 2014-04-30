package com.takeout.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.takeout.dao.*;
import com.takeout.domain.*;

public class AnnoucementDaoImpl extends HibernateDaoSupport implements
		AnnoucementDao {

	public Annoucement get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Annoucement.class, id);
	}

	public Integer save(Annoucement annoucement) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(annoucement);
	}

	public void update(Annoucement annoucement) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(annoucement);

	}

	public void delete(Annoucement annoucement) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(annoucement);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	public List<Annoucement> findAll() {
		// TODO Auto-generated method stub
		return (List<Annoucement>)getHibernateTemplate().find("from Annoucement");
	}

}
