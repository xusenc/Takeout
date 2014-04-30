package com.takeout.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.takeout.dao.*;
import com.takeout.domain.*;

public class AnnouncementDaoImpl extends HibernateDaoSupport implements
		AnnouncementDao {

	public Announcement get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Announcement.class, id);
	}

	public Integer save(Announcement annoucement) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(annoucement);
	}

	public void update(Announcement annoucement) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(annoucement);

	}

	public void delete(Announcement annoucement) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(annoucement);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	public List<Announcement> findAll() {
		// TODO Auto-generated method stub
		return (List<Announcement>)getHibernateTemplate().find("from Announcement");
	}

}
