package com.takeout.dao;
import com.takeout.domain.*;

import java.util.List;


public interface CityDao {
	City get(Integer id);
	
	Integer save(City city);
	
	void update(City city);
	
	void delete(City city);
	
	void delete(Integer id);
	
	List<City> findAll();	
}
