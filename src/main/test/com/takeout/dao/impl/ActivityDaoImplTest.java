package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.*;
import com.takeout.domain.*;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.hamcrest.CoreMatchers;

import com.takeout.util.MyHibernateDaoSupport;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.hibernate.Query;
import org.hibernate.Session;
public class ActivityDaoImplTest {
	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);

	private ActivityDao activityDao = null;

	@Before
	public void setUp() {
		ActivityDaoImpl activityDaoImpl = new ActivityDaoImpl();
		activityDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		activityDao = activityDaoImpl;
	}

	@Test
	public void testget1() {
		final Activity activity = new Activity();

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Activity.class, 1);
				will(returnValue(activity));
			}
		});

		Activity actual = activityDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, activity);
	}

	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Activity.class, 1);
				will(returnValue(null));
			}
		});

		Activity actual = activityDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}

	@Test
	public void testsave1() {
		final Activity activity = new Activity();
		activity.setActivityId(2);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(activity);
				will(returnValue(2));
			}
		});

		int id = activityDao.save(activity);

		context.assertIsSatisfied();

		assertEquals("test save1() method: ",
				2, id);
	}

	@Test
	public void testUpdate() {
		final Activity activity1 = new Activity();
		activity1.setActivityId(3);
		//1.setBookname("book1");
		activity1.setActivityName("123");
		final Activity activity2 = activity1;
		//book2.setBookname("book2");
		activity2.setActivityName("321");

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(activity1);
				will(returnValue(3));
				activity1.setActivityName("321");
				oneOf(mockHibernateTemplate).update(activity1);
				oneOf(mockHibernateTemplate).get(Activity.class, 3);
				will(returnValue(activity2));
			}
		});

		int id = activityDao.save(activity1);
		assertEquals("test update(Book book) method: ",
			3, id);
		activity1.setActivityName("321");
		activityDao.update(activity1);
		Activity book3 = activityDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			activity2, book3);
	}

	@Test
	public void testDelete() {
		final Activity ac1 = new Activity();
		ac1.setActivityId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(ac1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(ac1);
				oneOf(mockHibernateTemplate).get(Activity.class, 3);
				will(returnValue(null));
			}
		});

		int id = activityDao.save(ac1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		activityDao.delete(ac1);
		Activity ac3 = activityDao.get(3);
		assertNull("test delete(Book book) method: ",
			ac3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}

	@Test
	public void testFindAll() {
		final List<Activity> activity = new ArrayList<Activity>();
		Activity ac1 = new Activity();
		ac1.setActivityId(1);
		Activity ac2 = new Activity();
		ac2.setActivityId(2);
		Activity ac3 = new Activity();
		ac3.setActivityId(3);
		activity.add(ac1);
		activity.add(ac2);
		activity.add(ac3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Activity");
				will(returnValue(activity));
			}
		});

		List<Activity> activitys = activityDao.findAll();
		assertEquals("test findAll() method: ",
				activity, activitys);

		context.assertIsSatisfied();

	}
}
