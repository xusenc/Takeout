package com.takeout.domain;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
public class DishCommentTest {
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
		
		DishComment dc = new DishComment();
		dc.setDisComId(1);
		dc.setCustomId(2);
		dc.setCustomerId(123);
		dc.setCommentText("¹þ¹þ");
		dc.setCommentTime(new Timestamp(new java.util.Date().getTime()));
		dc.setDishId(2);
		dc.setShopId(3);
		dc.setShopReply("¸¸´°¿Ú");
		
		
		session.save(dc);
		tx.commit();
		assertNotEquals("test orders", 0, dc.getDisComId());
		session.close();
	}
}
