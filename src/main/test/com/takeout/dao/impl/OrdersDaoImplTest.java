package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.OrdersDao;
import com.takeout.domain.Orders;

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
/**
 * unit test for OrdersDaoImpl Class
 * 
 * @author xusen
 *	@version 1.0
 */
@RunWith(JMock.class)
public class OrdersDaoImplTest {
	
	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);
	
	private OrdersDao ordersDao = null;
	
	@Before
	public void setUp() {
		OrdersDaoImpl ordersDaoImpl = new OrdersDaoImpl();
		ordersDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		ordersDao = ordersDaoImpl;
	}
	
	@Test
	public void testget1() {
		final Orders orders = new Orders();
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Orders.class, 1);
				will(returnValue(orders));
			}
		});
		
		Orders actual = ordersDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, orders);
	}
	
	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Orders.class, 1);
				will(returnValue(null));
			}
		});
		
		Orders actual = ordersDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}
	
	@Test
	public void testsave1() {
		final Orders orders = new Orders();
		orders.setOrderId(2);
		
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
		final Orders order1 = new Orders();
		order1.setOrderId(3);
		//1.setBookname("book1");
		order1.setNotes("123");
		final Orders order2 = order1;
		//book2.setBookname("book2");
		order2.setNotes("321");

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(order1);
				will(returnValue(3));
				order1.setNotes("321");
				oneOf(mockHibernateTemplate).update(order1);
				oneOf(mockHibernateTemplate).get(Orders.class, 3);
				will(returnValue(order2));
			}
		});

		int id = ordersDao.save(order1);
		assertEquals("test update(Book book) method: ",
			3, id);
		order1.setNotes("321");
		ordersDao.update(order1);
		Orders book3 = ordersDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			order2, book3);
	}
	
	@Test
	public void testDelete() {
		final Orders book1 = new Orders();
		book1.setOrderId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(book1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(book1);
				oneOf(mockHibernateTemplate).get(Orders.class, 3);
				will(returnValue(null));
			}
		});

		int id = ordersDao.save(book1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		ordersDao.delete(book1);
		Orders book3 = ordersDao.get(3);
		assertNull("test delete(Book book) method: ",
			book3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}
	
	@Test
	public void testFindAll() {
		final List<Orders> orders = new ArrayList<Orders>();
		Orders order1 = new Orders();
		order1.setOrderId(1);
		Orders order2 = new Orders();
		order1.setOrderId(2);
		Orders order3 = new Orders();
		order1.setOrderId(3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Orders");
				will(returnValue(orders));
			}
		});
		
		List<Orders> orderss = ordersDao.findAll();
		assertEquals("test findAll() method: ",
				orders, orderss);
		
		context.assertIsSatisfied();
		
	}
	
	
	
	
}
