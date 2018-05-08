package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.Notice;

public interface NoticeDao {
	List<Notice> findAll();
	
	Notice selectById(Integer id);
	
	int insert(Notice notice);
	
	int update(Notice notice);
	
	int delete(Integer id);
}
