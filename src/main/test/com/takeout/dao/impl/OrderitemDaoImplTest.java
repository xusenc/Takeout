package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.OrderitemDao;
import com.takeout.domain.Orderitem;

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
public class OrderitemDaoImplTest {
	
	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);
	
	private OrderitemDao itemDao = null;
	
	@Before
	public void setUp() {
		OrderitemDaoImpl ordersDaoImpl = new OrderitemDaoImpl();
		ordersDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		itemDao = ordersDaoImpl;
	}
	
	@Test
	public void testget1() {
		final Orderitem orders = new Orderitem();
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Orderitem.class, 1);
				will(returnValue(orders));
			}
		});
		
		Orderitem actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, orders);
	}
	
	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Orderitem.class, 1);
				will(returnValue(null));
			}
		});
		
		Orderitem actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}
	
	@Test
	public void testsave1() {
		final Orderitem orders = new Orderitem();
		orders.setItemId(1);
		
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
		final Orderitem order1 = new Orderitem();
		order1.setItemId(3);
		//1.setBookname("book1");
		order1.setCount(23);
		final Orderitem order2 = order1;
		//book2.setBookname("book2");
		order2.setCount(31);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(order1);
				will(returnValue(3));
				order1.setCount(31);
				oneOf(mockHibernateTemplate).update(order1);
				oneOf(mockHibernateTemplate).get(Orderitem.class, 3);
				will(returnValue(order2));
			}
		});

		int id = itemDao.save(order1);
		assertEquals("test update(Book book) method: ",
			3, id);
		order1.setCount(31);
		itemDao.update(order1);
		Orderitem book3 = itemDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			order2, book3);
	}
	
	@Test
	public void testDelete() {
		final Orderitem book1 = new Orderitem();
		book1.setItemId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(book1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(book1);
				oneOf(mockHibernateTemplate).get(Orderitem.class, 3);
				will(returnValue(null));
			}
		});

		int id = itemDao.save(book1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		itemDao.delete(book1);
		Orderitem book3 = itemDao.get(3);
		assertNull("test delete(Book book) method: ",
			book3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}
	
	@Test
	public void testFindAll() {
		final List<Orderitem> orders = new ArrayList<Orderitem>();
		Orderitem order1 = new Orderitem();
		order1.setOrderId(1);
		Orderitem order2 = new Orderitem();
		order2.setOrderId(2);
		Orderitem order3 = new Orderitem();
		order3.setOrderId(3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Orderitem");
				will(returnValue(orders));
			}
		});
		
		List<Orderitem> orderss = itemDao.findAll();
		assertEquals("test findAll() method: ",
				orders, orderss);
		
		context.assertIsSatisfied();
		
	}

}
