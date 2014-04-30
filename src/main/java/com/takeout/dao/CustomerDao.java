package com.takeout.dao;
import com.takeout.domain.*;

import java.util.List;


public interface CustomerDao {
	Customer get(Integer id);
	
	Integer save(Customer customer);
	
	void update(Customer customer);
	
	void delete(Customer customer);
	
	void delete(Integer id);
	
	List<Customer> findAll();	
}
