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
 * unit test for Shopcomment Class
 * 
 * @author xusen
 *	@version 1.0
 */
public class ShopcommentTest {
	
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
		
		Shopcomment comment = new Shopcomment();
		comment.setShopId(2);
		comment.setShopName("sdfd");
		comment.setCommentText("very good");
		comment.setShopReply("s23423");
		session.save(comment);
		
		tx.commit();
		assertNotEquals("test orders", 0, comment.getShopComId());
		session.close();
	}
	
}
