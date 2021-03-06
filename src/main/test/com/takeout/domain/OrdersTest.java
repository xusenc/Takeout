package com.takeout.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
/**
 * unit test for Orders Class
 * 
 * @author xusen
 *	@version 1.0
 */
public class OrdersTest {
	
	private static SessionFactory sf = null;
	static byte t;
	@Before
	public void testUp() {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	@After
	public void tearDown() {
		sf.close();
	}
	
	@Test
	public void testOrders() {
		Session session =  sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Orders orders = new Orders();
		//orders.setOrderId(1);
		orders.setCustomerId(1);
		orders.setShopId(1);
		orders.setMobile("12342343");
		orders.setAddress("tianhe");
		orders.setTotal(new BigDecimal(23.34));
		//byte n = 1;
		
		//orders.setCreateTime(new Timestamp(new java.util.Date().getTime()));
		//orders.setEndTime(new Timestamp(new java.util.Date().getTime()));
		//orders.setCusOperation(n);
		session.save(orders);
		tx.commit();
		assertNotEquals("test orders", 0, orders.getOrderId());
		session.close();
	}
	
}
