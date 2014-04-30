package com.takeout.dao;
import com.takeout.domain.*;

import java.util.List;


public interface DishCommentDao {
	DishComment get(Integer id);
	
	Integer save(DishComment dishComment);
	
	void update(DishComment dishComment);
	
	void delete(DishComment dishComment);
	
	void delete(Integer id);
	
	List<DishComment> findAll();	
}
