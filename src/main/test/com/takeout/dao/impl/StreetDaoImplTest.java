package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.StreetDao;
import com.takeout.domain.Street;

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
 * unit test for StreetDaoImpl Class
 * 
 * @author xusen
 *	@version 1.0
 */
@RunWith(JMock.class)
public class StreetDaoImplTest {
	
	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);
	
	private StreetDao itemDao = null;
	
	@Before
	public void setUp() {
		StreetDaoImpl ordersDaoImpl = new StreetDaoImpl();
		ordersDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		itemDao = ordersDaoImpl;
	}
	
	@Test
	public void testget1() {
		final Street orders = new Street();
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Street.class, 1);
				will(returnValue(orders));
			}
		});
		
		Street actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, orders);
	}
	
	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Street.class, 1);
				will(returnValue(null));
			}
		});
		
		Street actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}
	
	@Test
	public void testsave1() {
		final Street orders = new Street();
		//orders.setStreetId(1);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(orders);
				will(returnValue(2));
			}
		});
		
		int id = itemDao.save(orders);
		
		context.assertIsSatisfied();
		
		assertEquals("test save1() method: ",
				2, id);
	}
	
	@Test
	public void testUpdate() {
		final Street order1 = new Street();
		//order1.setStreetId(3);
		order1.setStreetId(3);
		//1.setBookname("book1");
		order1.setStreetName("sdfsdf");
		
		final Street order2 = order1;
		//book2.setBookname("book2");
		//order2.setCount(31);
		order2.setStreetName("myname");

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(order1);
				will(returnValue(3));
				//order1.setCount(31);
				order1.setStreetName("myname");
				oneOf(mockHibernateTemplate).update(order1);
				oneOf(mockHibernateTemplate).get(Street.class, 3);
				will(returnValue(order2));
			}
		});

		int id = itemDao.save(order1);
		assertEquals("test update(Book book) method: ",
			3, id);
		order1.setStreetName("myname");
		itemDao.update(order1);
		Street book3 = itemDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			order2, book3);
	}
	
	@Test
	public void testDelete() {
		final Street book1 = new Street();
		book1.setStreetId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(book1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(book1);
				oneOf(mockHibernateTemplate).get(Street.class, 3);
				will(returnValue(null));
			}
		});

		int id = itemDao.save(book1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		itemDao.delete(book1);
		Street book3 = itemDao.get(3);
		assertNull("test delete(Book book) method: ",
			book3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}
	
	@Test
	public void testFindAll() {
		final List<Street> orders = new ArrayList<Street>();
		Street order1 = new Street();
		order1.setStreetId(1);
		Street order2 = new Street();
		order2.setStreetId(2);
		Street order3 = new Street();
		order3.setStreetId(3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Street");
				will(returnValue(orders));
			}
		});
		
		List<Street> orderss = itemDao.findAll();
		assertEquals("test findAll() method: ",
				orders, orderss);
		
		context.assertIsSatisfied();
		
	}

}
