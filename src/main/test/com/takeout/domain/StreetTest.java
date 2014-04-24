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
 * unit test for Street Class
 * 
 * @author xusen
 *	@version 1.0
 */
public class StreetTest {
	
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
		
		Street street = new Street();
		street.setStreetName("streetname");
		street.setLatitude(new BigDecimal(23.23));
		street.setLongitude(new BigDecimal(4));
		byte t = 23;
		street.setZoomLevel(t);
		session.save(street);
		
		tx.commit();
		assertNotEquals("test orders", 0, street.getStreetId());
		session.close();
	}
	
}
