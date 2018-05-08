package com.school.oa.dao.mapper;

import java.util.List;

import com.school.oa.entity.User;

public interface UserDao {
	User getUser(User user);
	
	User selectById(Integer id);
	
	int update(User user);
	
	int insert(User user);
	
	int delete(Integer id);
	
	List<User> findAll();
}
