package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.Subject;

public interface SubjectService {
	List<Subject> findAll();
	
	Subject selectById(Integer id);
	
	int createSubject(Subject subject);
	
	int updateSubject(Subject subject);
	
	int deleteSubject(Integer id);
}
