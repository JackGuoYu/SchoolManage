package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.OAClass;

public interface OAClassService {
	List<OAClass> findAll();
	
	OAClass selectById(Integer id);
	
	int createOAClass(OAClass oaclass);
	
	int updateOAClass(OAClass oaclass);
	
	int deleteOAClass(Integer id);
}
