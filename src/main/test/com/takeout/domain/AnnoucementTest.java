package com.takeout.domain;
import static org.junit.Assert.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
public class AnnoucementTest {
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
		
		Announcement an = new Announcement();
		an.setAnnouceId(1);
		an.setContent("diu");
		an.setImage("url:123");
		an.setShopId(3);
		
		session.save(an);
		tx.commit();
		assertNotEquals("test orders", 0, an.getAnnouceId());
		session.close();
	}
}
