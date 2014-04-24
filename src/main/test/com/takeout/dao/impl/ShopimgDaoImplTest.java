package com.takeout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.takeout.dao.ShopimgDao;
import com.takeout.domain.Shopimg;

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
public class ShopimgDaoImplTest {
	
	private final Mockery context = new Mockery(){{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	private  final HibernateTemplate mockHibernateTemplate =
			context.mock(HibernateTemplate.class);
	
	private ShopimgDao itemDao = null;
	
	@Before
	public void setUp() {
		ShopimgDaoImpl ordersDaoImpl = new ShopimgDaoImpl();
		ordersDaoImpl.setHibernateTemplate(mockHibernateTemplate);
		itemDao = ordersDaoImpl;
	}
	
	@Test
	public void testget1() {
		final Shopimg orders = new Shopimg();
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Shopimg.class, 1);
				will(returnValue(orders));
			}
		});
		
		Shopimg actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertEquals("test get1() method: ",
				actual, orders);
	}
	
	@Test
	public void testget2() {
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).get(Shopimg.class, 1);
				will(returnValue(null));
			}
		});
		
		Shopimg actual = itemDao.get(1);
		context.assertIsSatisfied();
		assertNull("test get2() method: ",
				actual);
	}
	
	@Test
	public void testsave1() {
		final Shopimg orders = new Shopimg();
		//orders.setShopImgId(1);
		
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
		final Shopimg order1 = new Shopimg();
		//order1.setShopImgId(3);
		order1.setShopImgId(3);
		//1.setBookname("book1");
		order1.setImgPath("sdfsdf");
		
		final Shopimg order2 = order1;
		//book2.setBookname("book2");
		//order2.setCount(31);
		order2.setImgPath("myname");

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(order1);
				will(returnValue(3));
				//order1.setCount(31);
				order1.setImgPath("myname");
				oneOf(mockHibernateTemplate).update(order1);
				oneOf(mockHibernateTemplate).get(Shopimg.class, 3);
				will(returnValue(order2));
			}
		});

		int id = itemDao.save(order1);
		assertEquals("test update(Book book) method: ",
			3, id);
		order1.setImgPath("myname");
		itemDao.update(order1);
		Shopimg book3 = itemDao.get(3);

		context.assertIsSatisfied();

		assertEquals("test update(Book book) method: ",
			order2, book3);
	}
	
	@Test
	public void testDelete() {
		final Shopimg book1 = new Shopimg();
		book1.setShopImgId(3);

		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).save(book1);
				will(returnValue(3));
				oneOf(mockHibernateTemplate).delete(book1);
				oneOf(mockHibernateTemplate).get(Shopimg.class, 3);
				will(returnValue(null));
			}
		});

		int id = itemDao.save(book1);
		assertEquals("test delete(Book book) method: ",
			3, id);
		itemDao.delete(book1);
		Shopimg book3 = itemDao.get(3);
		assertNull("test delete(Book book) method: ",
			book3);

		context.assertIsSatisfied();

		//assertNull("test delete(Book book) method: ", )
	}
	
	@Test
	public void testFindAll() {
		final List<Shopimg> orders = new ArrayList<Shopimg>();
		Shopimg order1 = new Shopimg();
		order1.setShopImgId(1);
		Shopimg order2 = new Shopimg();
		order2.setShopImgId(2);
		Shopimg order3 = new Shopimg();
		order3.setShopImgId(3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		context.checking(new Expectations() {
			{
				oneOf(mockHibernateTemplate).find("from Shopimg");
				will(returnValue(orders));
			}
		});
		
		List<Shopimg> orderss = itemDao.findAll();
		assertEquals("test findAll() method: ",
				orders, orderss);
		
		context.assertIsSatisfied();
		
	}

}
