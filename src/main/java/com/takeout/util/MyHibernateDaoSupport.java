package com.takeout.util;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *  util Class for Hibernate Dao
 *  
 *  @author xusen
 *  @version 1.0
 */
public class MyHibernateDaoSupport
extends HibernateDaoSupport {
	/**
	 *  page and query
	 *  
	 * @param hql to query
	 * @param offset
	 * @param pageSize
	 * @return a list for result
	 */
	public List findByPage(final String hql, 
			final int offset, final int pageSize) {
		List list = getHibernateTemplate()
				.executeFind(new HibernateCallback()
				{
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException
							{

						List result = session.createQuery(hql)
								.setFirstResult(offset)
								.setMaxResults(pageSize)
								.list();
						return result;
							}
				});
		return list;
	}

	/**
	 * page and query
	 * 
	 * @param hql
	 * @param value
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List findByPage(final String hql , final Object value ,
			final int offset, final int pageSize) {
		List list = getHibernateTemplate()
				.executeFind(new HibernateCallback()
				{
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException
							{
						List result = session.createQuery(hql)

								.setParameter(0, value) 
								.setFirstResult(offset)
								.setMaxResults(pageSize)
								.list();
						return result;
							}
				});
		return list;
	}

	/**
	 *  page and query
	 *  
	 * @param hql
	 * @param values
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List findByPage(final String hql, final Object[] values,
			final int offset, final int pageSize) {
		List list = getHibernateTemplate()
				.executeFind(new HibernateCallback()
				{
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException
							{
						Query query = session.createQuery(hql);

						for (int i = 0 ; i < values.length ; i++)
							query.setParameter( i, values[i]);

						List result = query.setFirstResult(offset)
								.setMaxResults(pageSize)
								.list();
						return result;
							}
				});
		return list;
	}
}
