package com.school.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.school.oa.dao.mapper.RoleDao;
import com.school.oa.entity.Role;
import com.school.oa.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleDao roleDao;
	
	@Override
	public int createRole(Role role) {
		int result = roleDao.insert(role);
		return result;
	}

	@Override
	public int updateRole(Role role) {
		int result = roleDao.update(role);
		return result;
	}

	@Override
	public int deleteRole(Integer id) {
		int result = roleDao.delete(id);
		return result;
	}

	@Override
	public Role selectById(Integer id) {
		Role role = roleDao.selectById(id);
		return role;
	}

	@Override
	public List<Role> findAll() {
		List<Role> roles = roleDao.findAll();
		return roles;
	}

}
