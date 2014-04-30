package com.takeout.dao;
import com.takeout.domain.*;
import java.util.List;


public interface DishImgDao {
	DishImg get(Integer id);
	
	Integer save(DishImg dishImg);
	
	void update(DishImg dishImg);
	
	void delete(DishImg dishImg);
	
	void delete(Integer id);
	
	List<DishImg> findAll();	
}
