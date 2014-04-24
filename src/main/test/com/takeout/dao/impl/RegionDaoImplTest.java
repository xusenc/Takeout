package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.RegionDao;
import com.takeout.domain.Region;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * unit test for RegionDaoImpl Class
 * 
 * @author xusen
 *	@version 1.0
 */
@RunWith(JMock.class)
public class RegionDaoImplTest {
	
	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);
	
	private RegionDao ordersDao = null;
	
	@Before
	public void setUp() {
		RegionDaoImpl ordersDaoImpl = new RegionDaoImpl();
		ordersDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		ordersDao = ordersDaoImpl;
	}
	
	@Test
	public void testget1() {
		final Region orders = new Region();
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Region.class, 1);
				will(returnValue(orders));
			}
		});
		
		Region actual = ordersDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, orders);
	}
	
	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Region.class, 1);
				will(returnValue(null));
			}
		});
		
		Region actual = ordersDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}
	
	@Test
	public void testsave1() {
		final Region orders = new Region();
		orders.setRegionId(2);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(orders);
				will(returnValue(2));
			}
		});
		
		int id = ordersDao.save(orders);
		
		context.assertIsSatisfied();
		
		assertEquals("test save1() method: ",
				2, id);
	}
	
	@Test
	public void testUpdate() {
		final Region order1 = new Region();
		order1.setRegionId(3);
		//1.setBookname("book1");
		//order1.("123");
		order1.setCityName("city1");
		final Region order2 = order1;
		//book2.setBookname("book2");
		order2.setCityName("city2");

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(order1);
				will(returnValue(3));
				order1.setCityName("city2");
				oneOf(mockHibernateTemplate).update(order1);
				oneOf(mockHibernateTemplate).get(Region.class, 3);
				will(returnValue(order2));
			}
		});

		int id = ordersDao.save(order1);
		assertEquals("test update(Book book) method: ",
			3, id);
		order1.setCityName("city2");
		ordersDao.update(order1);
		Region book3 = ordersDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			order2, book3);
	}
	
	@Test
	public void testDelete() {
		final Region book1 = new Region();
		book1.setRegionId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(book1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(book1);
				oneOf(mockHibernateTemplate).get(Region.class, 3);
				will(returnValue(null));
			}
		});

		int id = ordersDao.save(book1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		ordersDao.delete(book1);
		Region book3 = ordersDao.get(3);
		assertNull("test delete(Book book) method: ",
			book3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}
	
	@Test
	public void testFindAll() {
		final List<Region> orders = new ArrayList<Region>();
		Region order1 = new Region();
		order1.setRegionId(1);
		Region order2 = new Region();
		order1.setRegionId(2);
		Region order3 = new Region();
		order1.setRegionId(3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Region");
				will(returnValue(orders));
			}
		});
		
		List<Region> orderss = ordersDao.findAll();
		assertEquals("test findAll() method: ",
				orders, orderss);
		
		context.assertIsSatisfied();
		
	}
}
