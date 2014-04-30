package com.takeout.domain;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
public class DishTest {
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
		
		Dish di = new Dish();
		di.setDishId(1);
		di.setAcceptOrder(1);
		di.setAnnotation("123");
		di.setDiscountPrice(new BigDecimal(123.23));
		di.setDishName("≈≈π«");
		di.setIsDiscount(1);
		di.setLastUpdate(new Timestamp(new java.util.Date().getTime()));
		di.setNumClick(1);
		di.setNumPraise(2);
		di.setPrice(new BigDecimal(11.23));
		di.setSectionId(3);
		di.setSectionName("ª®÷Ì");
		di.setShopId(4);
		di.setShopName("¬È¿±œ„π¯");
		
		
		
		session.save(di);
		tx.commit();
		assertNotEquals("test orders", 0, di.getDishId());
		session.close();
	}
}
