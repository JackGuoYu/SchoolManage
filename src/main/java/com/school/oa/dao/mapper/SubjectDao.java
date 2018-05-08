package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.Subject;

public interface SubjectDao {
	
	Subject selectById(Integer id);
	
	int update(Subject subject);
	
	int insert(Subject subject);
	
	int delete(Integer id);
	
	List<Subject> findAll();
}
