package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.ShopcommentDao;
import com.takeout.domain.Shopcomment;

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
 * unit test for OrdersDaoImpl Class
 * 
 * @author xusen
 *	@version 1.0
 */
@RunWith(JMock.class)
public class ShopcommentDaoImplTest {

	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);

	private ShopcommentDao itemDao = null;

	@Before
	public void setUp() {
		ShopcommentDaoImpl ordersDaoImpl = new ShopcommentDaoImpl();
		ordersDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		itemDao = ordersDaoImpl;
	}

	@Test
	public void testget1() {
		final Shopcomment orders = new Shopcomment();

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Shopcomment.class, 1);
				will(returnValue(orders));
			}
		});

		Shopcomment actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, orders);
	}

	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Shopcomment.class, 1);
				will(returnValue(null));
			}
		});

		Shopcomment actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}

	@Test
	public void testsave1() {
		final Shopcomment orders = new Shopcomment();
		//orders.setShopComId(1);

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
		final Shopcomment order1 = new Shopcomment();
		//order1.setShopComId(3);
		order1.setShopComId(3);
		//1.setBookname("book1");
		order1.setShopName("sdfsdf");

		final Shopcomment order2 = order1;
		//book2.setBookname("book2");
		//order2.setCount(31);
		order2.setShopName("myname");

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(order1);
				will(returnValue(3));
				//order1.setCount(31);
				order1.setShopName("myname");
				oneOf(mockHibernateTemplate).update(order1);
				oneOf(mockHibernateTemplate).get(Shopcomment.class, 3);
				will(returnValue(order2));
			}
		});

		int id = itemDao.save(order1);
		assertEquals("test update(Book book) method: ",
			3, id);
		order1.setShopName("myname");
		itemDao.update(order1);
		Shopcomment book3 = itemDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			order2, book3);
	}

	@Test
	public void testDelete() {
		final Shopcomment book1 = new Shopcomment();
		book1.setShopComId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(book1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(book1);
				oneOf(mockHibernateTemplate).get(Shopcomment.class, 3);
				will(returnValue(null));
			}
		});

		int id = itemDao.save(book1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		itemDao.delete(book1);
		Shopcomment book3 = itemDao.get(3);
		assertNull("test delete(Book book) method: ",
			book3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}

	@Test
	public void testFindAll() {
		final List<Shopcomment> orders = new ArrayList<Shopcomment>();
		Shopcomment order1 = new Shopcomment();
		order1.setShopComId(1);
		Shopcomment order2 = new Shopcomment();
		order2.setShopComId(2);
		Shopcomment order3 = new Shopcomment();
		order3.setShopComId(3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Shopcomment");
				will(returnValue(orders));
			}
		});

		List<Shopcomment> orderss = itemDao.findAll();
		assertEquals("test findAll() method: ",
				orders, orderss);

		context.assertIsSatisfied();

	}

}
