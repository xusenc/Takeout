package com.takeout.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
/**
 * unit test for Seller Class
 * 
 * @author xusen
 *	@version 1.0
 */
public class SellerTest {
	
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
		
		Seller seller = new Seller();
		seller.setSellerName("Iamseller");
		seller.setPassword("234234");
		seller.setRegTime(new Timestamp(new java.util.Date().getTime()));
		//session.save(orders);
		session.save(seller);
		tx.commit();
		assertNotEquals("test orders", 0, seller.getSellerId());
		session.close();
	}
	
}
