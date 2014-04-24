package com.takeout.domain;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
/**
 * unit test for Region Class
 * 
 * @author xusen
 *	@version 1.0
 */
public class RegionTest {
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
		
		Region region = new Region();
		
		region.setRegionName("region");
		region.setCityId(1);
		region.setCityName("city");
		region.setLatitude(new BigDecimal(23.23));
		region.setLongitude(new BigDecimal(32.32));
		byte n = 2;
		region.setZoomLevel(n);
		
		session.save(region);
		
		tx.commit();
		assertNotEquals("test orders", 0, region.getRegionId());
		session.close();
	}
}
