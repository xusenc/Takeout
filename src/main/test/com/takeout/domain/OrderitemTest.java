package com.takeout.domain;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
public class OrderitemTest {

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
		
		Orderitem item = new Orderitem();
		item.setOrderId(1);
		item.setDishId(1);
		item.setDishName("mydish");
		item.setPrice(new BigDecimal(23.22));
		item.setCount(1);
		item.setShopId(1);
		item.setShopName("myshop");
		session.save(item);
		tx.commit();
		assertNotEquals("test orders", 0, item.getItemId());
		session.close();
	}
}
