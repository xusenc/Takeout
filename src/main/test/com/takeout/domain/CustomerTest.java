package com.takeout.domain;
import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.*;
public class CustomerTest {
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
		
		Customer cu = new Customer();
		cu.setCustomerId(1);
		cu.setEmail("abc@123.com");
		cu.setEmailVerified(1);
		cu.setHeadUrl("abc.com");
		cu.setLastCity("guangzhou");
		cu.setLastCityId(3);
		cu.setLastClient(1);
		cu.setLastTime(new Timestamp(new java.util.Date().getTime()));
		cu.setMobile("12345");
		cu.setMobileVerified(2);
		cu.setOtherPlatform("sfsdf");
		cu.setMobileVerifing(2);
		cu.setPassword("12355");
		cu.setRegTime(new Timestamp(new java.util.Date().getTime()));
		cu.setScore(123);
		cu.setUserName("hu");
		
		
		session.save(cu);
		tx.commit();
		assertNotEquals("test orders", 0, cu.getCustomerId());
		session.close();
	}
}
