package com.takeout.domain;

import static org.junit.Assert.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;

public class DishImgTest {
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
		
		DishImg di = new DishImg();
		di.setDishId(1);
		di.setDishImgId(2);
		di.setHeight(34);
		di.setWidth(13);
		di.setImgPath("sdffd");
		
		session.save(di);
		tx.commit();
		assertNotEquals("test orders", 0, di.getDishImgId());
		session.close();
	}
}
