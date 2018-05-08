package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.Role;

public interface RoleDao {
	List<Role> findAll();
	
	Role selectById(Integer id);
	
	int insert(Role role);
	
	int update(Role role);
	
	int delete(Integer id);
}
