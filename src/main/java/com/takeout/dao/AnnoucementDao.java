package com.takeout.dao;
import com.takeout.domain.*;
import java.util.List;

public interface AnnoucementDao {
	Annoucement get(Integer id);
	
	Integer save(Annoucement annoucement);
	
	void update(Annoucement annoucement);
	
	void delete(Annoucement annoucement);
	
	void delete(Integer id);
	
	List<Annoucement> findAll();	
}
