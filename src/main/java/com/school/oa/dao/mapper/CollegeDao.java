package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.College;

public interface CollegeDao {
	List<College> findAll();
	
	College selectById(Integer id);
	
	int insert(College college);
	
	int update(College college);
	
	int delete(Integer id);
}
