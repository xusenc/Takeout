package com.takeout.domain;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;

public class ActivityTest {
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
		
		Activity  ac = new Activity();
		ac.setActivityId(1);
		ac.setActivityName("activity");
		ac.setComtent("diaono");
		ac.setShopId(2);
		session.save(ac);
		
		
		tx.commit();
		assertNotEquals("test orders", 0, ac.getActivityId());
		session.close();
	}
}
