package com.takeout.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
/**
 * unit test for Shop Class
 * 
 * @author xusen
 *	@version 1.0
 */
public class ShopimgTest {
	
	private static SessionFactory sf = null;
	static byte t;
	@Before
	public void testUp() {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	@After
	public void tearDown() {
		if(sf != null)
			sf.close();
	}
	
	@Test
	public void testOrders() {
		Session session =  sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Shopimg img = new Shopimg();
		img.setShopId(2);
		
		session.save(img);
		
		
		tx.commit();
		assertNotEquals("test orders", 0, img.getShopImgId());
		session.close();
	}
	
}
