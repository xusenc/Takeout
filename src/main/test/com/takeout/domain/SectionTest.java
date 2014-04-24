package com.takeout.domain;

import static org.junit.Assert.*;
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
public class SectionTest {
	
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
		
		Section section = new Section();
		section.setSectionName("mysection");
		section.setShopId(23);
		section.setShopName("myshop");
		byte t = 23;
		section.setAcceptOrder(t);
		section.setLastUpdate(new java.sql.Timestamp(new java.util.Date().getTime()));
		session.save(section);
		tx.commit();
		assertNotEquals("test orders", 0, section.getSectionId());
		session.close();
	}
}
