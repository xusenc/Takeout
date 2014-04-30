package com.takeout.dao;
import com.takeout.domain.*;
import java.util.List;


public interface ActivityDao {
	Activity get(Integer id);
	
	Integer save(Activity acivity);
	
	void update(Activity acivity);
	
	void delete(Activity acivity);
	
	void delete(Integer id);
	
	List<Activity> findAll();
}
