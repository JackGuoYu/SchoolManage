package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.College;

public interface CollegeService {
	List<College> findAll();
	
	College selectById(Integer id);
	
	int createCollege(College College);
	
	int updateCollege(College College);
	
	int deleteCollege(Integer id);
}
