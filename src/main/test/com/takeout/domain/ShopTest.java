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
public class ShopTest {
	
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
		
		Shop shop = new Shop();
		shop.setSellerId(1);
		shop.setShopName("myshop");
		shop.setMobile("2342342");
		shop.setCityId(23);
		shop.setCityName("city");
		shop.setNotice("mynotice");
		shop.setLatitude(new BigDecimal(23.32));
		shop.setLongitude(new BigDecimal(233.3));
		shop.setLastUpdate(new Timestamp(new Date().getTime()));
		session.save(shop);
		
		
		tx.commit();
		assertNotEquals("test orders", 0, shop.getSellerId());
		session.close();
	}
	
}
