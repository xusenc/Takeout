package com.takeout.dao;
import com.takeout.domain.*;
import java.util.List;

public interface AnnouncementDao {
	Announcement get(Integer id);
	
	Integer save(Announcement annoucement);
	
	void update(Announcement annoucement);
	
	void delete(Announcement annoucement);
	
	void delete(Integer id);
	
	List<Announcement> findAll();	
}
