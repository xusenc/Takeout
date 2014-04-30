package com.takeout.dao;
import com.takeout.domain.*;

import java.util.List;


public interface DishDao {
	Dish get(Integer id);
	
	Integer save(Dish dish);
	
	void update(Dish dish);
	
	void delete(Dish dish);
	
	void delete(Integer id);
	
	List<Dish> findAll();	
}
