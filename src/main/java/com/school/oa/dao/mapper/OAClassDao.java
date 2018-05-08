package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.OAClass;

public interface OAClassDao {
	List<OAClass> findAll();
	
	OAClass selectById(Integer id);
	
	int insert(OAClass oaclass);
	
	int update(OAClass oaclass);
	
	int delete(Integer id);
}
