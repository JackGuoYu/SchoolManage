package com.school.oa.service;

import java.util.List;

import com.school.oa.entity.Role;

public interface RoleService {
	List<Role> findAll();
	
	Role selectById(Integer id);
	
	int createRole(Role role);
	
	int updateRole(Role role);
	
	int deleteRole(Integer id);
}
