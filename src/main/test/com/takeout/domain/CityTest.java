package com.takeout.domain;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
public class CityTest {
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
		
		City ci = new City();
		ci.setCityId(1);
		ci.setCityName("guangzhou");
		ci.setLatitude(new BigDecimal(22.31));
		ci.setLongtitude(new BigDecimal(23.21));
		ci.setZoomLevel(3);
		
		
		session.save(ci);
		tx.commit();
		assertNotEquals("test orders", 0, ci.getCityId());
		session.close();
	}
}
